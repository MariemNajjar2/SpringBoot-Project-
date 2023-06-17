package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.ICoursRepo;
import com.example.demo.repository.IInscriptionRepo;
import com.example.demo.repository.ISkieurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class InscriptionServiceImpl implements  IInscriptionService {
    @Autowired
    IInscriptionRepo iInscriptionRepo ;
    @Autowired
    ICoursRepo iCoursRepo ;
    @Autowired
    ISkieurRepo iSkieurRepo;
    @Override
    public Inscription assignInscriptionToCours(Long numInscri, Long numCours) {
       Inscription Inscri = iInscriptionRepo.findById(numInscri).get();
       Cours cours= iCoursRepo.findById(numCours).get();
       Inscri.setCours(cours);
       cours.getInscri().add(Inscri);
       iCoursRepo.save(cours);
       return Inscri;
    }



    @Override
    public Inscription addInscriptionAndAssignToSkieurAndCours(Inscription inscription, Long numSkieur, Long numCours) {
        iInscriptionRepo.save(inscription);
        Cours cours= iCoursRepo.findById(numCours).get();
        cours.getInscri().add(inscription);
        Skieur ski = iSkieurRepo.findById(numSkieur).get();
        ski.getInscriptions().add(inscription);
        inscription.setSkieurs(ski);
        inscription.setCours(cours);
        iCoursRepo.save(cours);
        iSkieurRepo.save(ski);
        return inscription ;
    }

    @Override
    public List<Integer> numWeeksCourseOfMoniteurBySupport(Long numMoniteur, Support support) {
        return null;
    }

}
