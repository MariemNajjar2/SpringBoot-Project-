package com.example.demo.repository;

import com.example.demo.entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPisteRepo extends JpaRepository<Piste, Long> {
}
