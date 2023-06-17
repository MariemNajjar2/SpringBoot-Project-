package com.example.demo.repository;

import com.example.demo.entity.Moniteur;
import com.example.demo.entity.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface IMoniteurRepo extends JpaRepository<Moniteur,Long> {

 @Query("select m from Moniteur m , Cours c where m.coursMoniteur = c and c.support = :support ")
  Moniteur retrieveMoniteurPerSupprtCours(@Param("support")Support support);
}
