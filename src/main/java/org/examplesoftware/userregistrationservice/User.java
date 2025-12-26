package org.examplesoftware.userregistrationservice;

public class User {
    private final String email;
    private String password;
    private String name;
    private Long id;

    public User(String email, String password, String name, Long id) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
