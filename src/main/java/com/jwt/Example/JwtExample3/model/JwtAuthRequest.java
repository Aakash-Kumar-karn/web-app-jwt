package com.jwt.Example.JwtExample3.model;

import lombok.Data;

@Data
public class JwtAuthRequest {

    private String email;
    private String password;

    public JwtAuthRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public JwtAuthRequest() {

    }

    @Override
    public String toString() {
        return "JwtAuthRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
