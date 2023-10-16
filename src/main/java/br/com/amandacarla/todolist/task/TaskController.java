//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.amandacarla.todolist.task;

import br.com.amandacarla.todolist.utils.Utils;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/tasks"})
public class TaskController {
    @Autowired
    private ITaskRespository taskRespository;

    public TaskController() {
    }

    @PostMapping({"/"})
    public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
        Object idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID)idUser);
        LocalDateTime currentDate = LocalDateTime.now();
        if (!currentDate.isAfter(taskModel.getStartAt()) && !currentDate.isAfter(taskModel.getEndAt())) {
            if (taskModel.getStartAt().isAfter(taskModel.getEndAt())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de inicio deve ser menor do que a data de término");
            } else {
                TaskModel task = (TaskModel)this.taskRespository.save(taskModel);
                return ResponseEntity.status(HttpStatus.OK).body(task);
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de inicio / data de término deve ser maior que a data atual");
        }
    }

    @GetMapping({"/"})
    public List<TaskModel> list(HttpServletRequest request) {
        Object idUser = request.getAttribute("idUser");
        List<TaskModel> tasks = this.taskRespository.findByIdUser((UUID)idUser);
        return tasks;
    }

    @PutMapping({"/{id}"})
    public ResponseEntity update(@RequestBody TaskModel taskModel, @PathVariable UUID id, HttpServletRequest request) {
        TaskModel task = (TaskModel)this.taskRespository.findById(id).orElse((TaskModel) null);
        if (task == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tarefa não encontrada");
        } else {
            Object idUser = request.getAttribute("idUser");
            if (!task.getIdUser().equals(idUser)) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não tem permissão de acesso a essa tarefa");
            } else {
                Utils.copyNonNullProperties(taskModel, task);
                TaskModel taskUpdated = (TaskModel)this.taskRespository.save(task);
                return ResponseEntity.ok().body(taskUpdated);
            }
        }
    }
}
