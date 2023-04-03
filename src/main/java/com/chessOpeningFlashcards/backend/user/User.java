package com.chessOpeningFlashcards.backend.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "corrects")
    private int corrects;

    @Column(name = "fails")
    private int fails;

    public User(
            String username,
            String password,
            String firstName,
            String lastName,
            int fails,
            int corrects) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fails = fails;
        this.corrects = corrects;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String newName) {
        this.username = newName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String fN) {
        this.firstName = fN;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lN) {
        this.lastName = lN;
    }

    public int getCorrects() {
        return this.corrects;
    }

    public void setCorrects(int c) {
        this.corrects = c;
    }

    public void incrementCorrects() {
        this.corrects += 1;
    }

    public int getFails() {
        return this.fails;
    }

    public void setFails(int f) {
        this.fails = f;
    }

    public void incrementFails() {
        this.fails += 1;
    }

}
