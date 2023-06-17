package com.example.demo.service;

import com.example.demo.entity.Cours;
import com.example.demo.entity.Support;

public interface ICoursService {
    Cours findCoursBySupport (Support S);
}
