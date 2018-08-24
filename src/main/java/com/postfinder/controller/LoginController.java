package com.postfinder.controller;

import com.postfinder.model.LoginModel;
import com.postfinder.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    private ResponseEntity LoginUser(@RequestBody LoginModel loginModel) {
        return loginService.loginUser(loginModel);
    }
}
