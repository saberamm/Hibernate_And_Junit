package entity.dto;


import java.time.LocalDate;

public class SimplePerson {
    private String firstname;

    private String lastname;

    private String username;

    private LocalDate birthDate;

    public SimplePerson(String firstname, String lastname, String username, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.birthDate = birthDate;
    }

    public SimplePerson() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "SimplePerson{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
