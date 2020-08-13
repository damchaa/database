package com.example.database.Model;

import javax.persistence.*;

@Entity
@Table(name = "usert")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    public User(){

    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + username + '\'' +
                ", password=" + password +  " role=" + role +
                 "}   ";
    }
}
