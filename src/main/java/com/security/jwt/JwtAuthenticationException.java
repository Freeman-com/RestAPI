package com.security.jwt;

import org.springframework.security.core.AuthenticationException;

/**
 * Authetication exception for JwtAppDemo application.
 *
 * @author anton kozinov
 * @version 1.0
 */

public class JwtAuthenticationException extends AuthenticationException {
    public JwtAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public JwtAuthenticationException(String msg) {
        super(msg);
    }
}
