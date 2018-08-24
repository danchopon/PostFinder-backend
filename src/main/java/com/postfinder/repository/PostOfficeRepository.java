package com.postfinder.repository;

import com.postfinder.model.PostOfficeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOfficeRepository extends JpaRepository<PostOfficeModel, Long> {

}
