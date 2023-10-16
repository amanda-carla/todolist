//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.amandacarla.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;

@Entity(
        name = "tb_users"
)
public class UserModel {
    @Id
    @GeneratedValue(
            generator = "UUID"
    )
    private UUID id;
    @Column(
            unique = true
    )
    private String username;
    private String name;
    private String password;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public UserModel() {
    }

    public UUID getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UserModel)) {
            return false;
        } else {
            UserModel other = (UserModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label71;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label71;
                    }

                    return false;
                }

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                label57: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label57;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label57;
                    }

                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt == null) {
                        return true;
                    }
                } else if (this$createdAt.equals(other$createdAt)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserModel;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getId();
        return "UserModel(id=" + var10000 + ", username=" + this.getUsername() + ", name=" + this.getName() + ", password=" + this.getPassword() + ", createdAt=" + this.getCreatedAt() + ")";
    }
}
