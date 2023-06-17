package com.example.demo.service;

import com.example.demo.entity.Abonnement;
import com.example.demo.entity.TypeAbonnement;
import com.example.demo.repository.IAbonnementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AbonnementServiceImpl implements IAbonnementService{

    @Autowired
    IAbonnementRepo iAbonnementRepo ;
    @Override
    public Abonnement findAbonnementPArType(TypeAbonnement TA) {
        return iAbonnementRepo.findAllByTypeAbon(TA);
    }
    public Abonnement findAbonnementParDate(Date d1 , Date d2 ){
        return iAbonnementRepo.findAllByDateDebtBetween(d1,d2);
    }
}
