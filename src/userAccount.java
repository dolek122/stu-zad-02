public class userAccount {
    private String login;
    private String password;
    private String name;
    private String surname;
    private String address;
    private String birth;

    public userAccount() {
        this("", "", "", "", "", "");
    }

    public userAccount(String login, String password, String name, String surname, String address, String birth) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.birth = birth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String toString() {
        return "UserAccount [login=" + login + ", password=" + "*".repeat(password.length()) + ", firstName=" + name
                + ", lastName=" + surname + ", address=" + address + ", birthdate=" + birth + "]";
    }
}