

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User1 {

    @Id
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "first_name")
    private String firstName;


    public Long getId1() {
        return id;
    }

    public void setId1(Long id) {
        this.id = id;
    }

    public String getUserName1() {
        return userName;
    }

    public void setUserName1(String userName) {
        this.userName = userName;
    }

    public String getFirstName1() {
        return firstName;
    }

    public void setFirstName1(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
