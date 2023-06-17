package com.example.demo.service;

import com.example.demo.entity.Abonnement;
import com.example.demo.entity.TypeAbonnement;

import java.util.Date;

public interface IAbonnementService {
   Abonnement findAbonnementPArType(TypeAbonnement TA ) ;
   Abonnement findAbonnementParDate(Date d1 , Date d2 );
}
