package com.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 * @author anton kozinau
 * @version 1.0
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}