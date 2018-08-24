package com.postfinder.controller;

import com.postfinder.model.PostOfficeModel;
import com.postfinder.service.PostOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostOfficeController {

    @Autowired
    private PostOfficeService postOfficeService;

    @GetMapping("/post-offices")
    public List<PostOfficeModel> getAllPostOffices() {
        return postOfficeService.getAllPostOffices();
    }

    @PostMapping("/calculate")
    public PostOfficeModel calculateDistance(@RequestBody PostOfficeModel postOfficeModel) {
        postOfficeService.calculateDistance(postOfficeModel);
        return postOfficeModel;

    }
}
