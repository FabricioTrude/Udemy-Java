package aulas._12_enum.a_134_order;

import java.util.Date;

import static aulas._12_enum.a_134_order.a_134.sdf;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Client: " + name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
