package com.restResponse;

import com.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/exchange/ascendex")

public class AscendexRestControllerV1 {

    private final UserService userService;


    public AscendexRestControllerV1(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping(value = "{credentials}")
//    public
}
