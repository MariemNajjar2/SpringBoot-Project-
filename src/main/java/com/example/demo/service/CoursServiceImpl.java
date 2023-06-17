package com.example.demo.service;

import com.example.demo.entity.Cours;
import com.example.demo.entity.Support;
import com.example.demo.repository.ICoursRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CoursServiceImpl implements ICoursService {
    @Autowired
    ICoursRepo iCoursRepo ;
    @Override
    public Cours findCoursBySupport(Support S) {
        log.info("get cours by support en sucés");
        return iCoursRepo.findAllBySupport(S);

    }
}
