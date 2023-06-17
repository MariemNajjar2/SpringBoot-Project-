package com.example.demo.service;

import com.example.demo.entity.Inscription;
import com.example.demo.entity.Support;
import com.example.demo.entity.TypeAbonnement;

import java.util.List;
import java.util.Set;

public interface IInscriptionService {
    public Inscription assignInscriptionToCours(Long numInscri , Long numCours );
   // Set<Inscription> getSubscriptionByType(TypeAbonnement typeAbon);
    Inscription addInscriptionAndAssignToSkieurAndCours(Inscription inscription, Long numSkieur, Long numCours);
    List<Integer> numWeeksCourseOfMoniteurBySupport(Long numMoniteur, Support support);
}
