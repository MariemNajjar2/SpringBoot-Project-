package com.example.demo.repository;

import com.example.demo.entity.Abonnement;
import com.example.demo.entity.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IAbonnementRepo extends JpaRepository<Abonnement , Long> {
    Abonnement findAllByTypeAbon(TypeAbonnement ta);

    Abonnement findAllByDateDebtBetween(Date d1, Date d2);
}
