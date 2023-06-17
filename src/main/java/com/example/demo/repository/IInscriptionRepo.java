package com.example.demo.repository;

import com.example.demo.entity.Inscription;
import com.example.demo.entity.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface IInscriptionRepo extends JpaRepository<Inscription,Long> {

    @Query("select I.numSemaine from Inscription I join Moniteur moniteur on I.cours member moniteur.coursMoniteur where moniteur.numMoniteur = :numMoniteur and I.cours.support = :support")
    List<Integer> numWeeksCourseOfMoniteurBySupport (@Param("numMoniteur") Long numMoniteur , @Param("support") Support support);
}
