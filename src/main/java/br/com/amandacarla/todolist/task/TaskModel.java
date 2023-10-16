//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.amandacarla.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;

@Entity(
        name = "tb_tasks"
)
public class TaskModel {
    @Id
    @GeneratedValue(
            generator = "UUID"
    )
    private UUID id;
    private String description;
    @Column(
            length = 50
    )
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private UUID idUser;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50) {
            throw new Exception("O campo title deve conter no máximo 50 caracteres");
        } else {
            this.title = title;
        }
    }

    public TaskModel() {
    }

    public UUID getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    public String getPriority() {
        return this.priority;
    }

    public UUID getIdUser() {
        return this.idUser;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setStartAt(final LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public void setEndAt(final LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public void setPriority(final String priority) {
        this.priority = priority;
    }

    public void setIdUser(final UUID idUser) {
        this.idUser = idUser;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TaskModel)) {
            return false;
        } else {
            TaskModel other = (TaskModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label107;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label107;
                    }

                    return false;
                }

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
                    return false;
                }

                label86: {
                    Object this$startAt = this.getStartAt();
                    Object other$startAt = other.getStartAt();
                    if (this$startAt == null) {
                        if (other$startAt == null) {
                            break label86;
                        }
                    } else if (this$startAt.equals(other$startAt)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$endAt = this.getEndAt();
                    Object other$endAt = other.getEndAt();
                    if (this$endAt == null) {
                        if (other$endAt == null) {
                            break label79;
                        }
                    } else if (this$endAt.equals(other$endAt)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$priority = this.getPriority();
                    Object other$priority = other.getPriority();
                    if (this$priority == null) {
                        if (other$priority == null) {
                            break label72;
                        }
                    } else if (this$priority.equals(other$priority)) {
                        break label72;
                    }

                    return false;
                }

                Object this$idUser = this.getIdUser();
                Object other$idUser = other.getIdUser();
                if (this$idUser == null) {
                    if (other$idUser != null) {
                        return false;
                    }
                } else if (!this$idUser.equals(other$idUser)) {
                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt != null) {
                        return false;
                    }
                } else if (!this$createdAt.equals(other$createdAt)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TaskModel;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $startAt = this.getStartAt();
        result = result * 59 + ($startAt == null ? 43 : $startAt.hashCode());
        Object $endAt = this.getEndAt();
        result = result * 59 + ($endAt == null ? 43 : $endAt.hashCode());
        Object $priority = this.getPriority();
        result = result * 59 + ($priority == null ? 43 : $priority.hashCode());
        Object $idUser = this.getIdUser();
        result = result * 59 + ($idUser == null ? 43 : $idUser.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getId();
        return "TaskModel(id=" + var10000 + ", description=" + this.getDescription() + ", title=" + this.getTitle() + ", startAt=" + this.getStartAt() + ", endAt=" + this.getEndAt() + ", priority=" + this.getPriority() + ", idUser=" + this.getIdUser() + ", createdAt=" + this.getCreatedAt() + ")";
    }
}
