package com.postfinder.service;

import com.postfinder.model.LoginModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public ResponseEntity loginUser(LoginModel loginForm) {
        switch (loginForm.getUsername()) {
            case "user1":
                if (loginForm.getPassword().equals("test1")) {

                    LoginModel loginModel = new LoginModel();
                    loginModel.setPassword("test1");
                    loginModel.setUsername("user1");
                    loginModel.setBattalionId(1);

                    return new ResponseEntity<>(loginModel, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Error while login", HttpStatus.UNAUTHORIZED);
                }
            case "user2":
                if (loginForm.getPassword().equals("test2")) {

                    LoginModel loginModel = new LoginModel();
                    loginModel.setPassword("test2");
                    loginModel.setUsername("user2");
                    loginModel.setBattalionId(2);

                    return new ResponseEntity<>(loginModel, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Error while login", HttpStatus.UNAUTHORIZED);
                }
            case "user3":
                if (loginForm.getPassword().equals("test3")) {

                    LoginModel loginModel = new LoginModel();
                    loginModel.setPassword("test3");
                    loginModel.setUsername("user3");
                    loginModel.setBattalionId(3);

                    return new ResponseEntity<>(loginModel, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Error while login", HttpStatus.UNAUTHORIZED);
                }
        }
        System.out.println("end result");
        return null;
    }
}
