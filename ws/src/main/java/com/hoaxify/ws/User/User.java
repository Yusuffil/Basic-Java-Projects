package com.hoaxify.ws.User;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @NotNull(message = "{hoaxify.constraint.username.NotNull.message}")
    @Size(min=4,max = 255)
    @UniqueUsername
    private String username;

    @NotNull
    @Size(min=4,max = 255)
    private String displayName;

    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$",message = "{hoaxify.constraint.password.Pattern.message}")
    @Size(min=8, max=255)
    private String password;

}