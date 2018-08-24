package com.postfinder.service;

import com.postfinder.model.PostOfficeModel;
import com.postfinder.repository.PostOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostOfficeServiceImpl implements PostOfficeService {

    @Autowired
    private PostOfficeRepository postOfficeRepository;

    List<PostOfficeModel> list = postOfficeRepository.findAll();


    public List<PostOfficeModel> getAllPostOffices() {
        return postOfficeRepository.findAll();
    }

    public void calculateDistance(PostOfficeModel postOfficeModel) {
        double myLat = postOfficeModel.getLatitude();
        double myLng = postOfficeModel.getLongitude();
        System.out.println(myLat);
        System.out.println(myLng);


    }

}
