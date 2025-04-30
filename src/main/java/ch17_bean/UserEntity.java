package ch17_bean;

public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    @Override
    public String toString() {
        return "UserEntity{" +
                "username=" + username +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
