package org.example.task3;

import java.util.UUID;

@Entity
@Table(name = "users")
public class Employee {

   @Column(name = "id", primaryKey = true)
    private UUID id;
   @Column(name = "username", primaryKey = false)
   private String username;
   @Column(name = "email", primaryKey = false)
   private String email;

    public Employee(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
