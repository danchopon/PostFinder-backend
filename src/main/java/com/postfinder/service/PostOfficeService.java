package com.postfinder.service;

import com.postfinder.model.PostOfficeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostOfficeService {

    List<PostOfficeModel> getAllPostOffices();

    void calculateDistance(PostOfficeModel postOfficeModel);

}
