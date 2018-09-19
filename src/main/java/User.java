import java.util.Objects;

public class User {
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Username, user.Username) &&
                Objects.equals(Password, user.Password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Username, Password);
    }

    public User(String username, String password) {
        Username = username;
        Password = password;

    }

    public String getPassword() {
        return Password;

    }

    public void setPassword(String password) {
        Password = password;
    }
}
