package com.jwt.Example.JwtExample3.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtAuthResponse {
    private String token;
    private String jwtToken;

}
