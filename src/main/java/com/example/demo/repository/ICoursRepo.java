package com.example.demo.repository;

import com.example.demo.entity.Cours;
import com.example.demo.entity.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursRepo extends JpaRepository<Cours,Long> {
    Cours findAllBySupport(Support s);
}
