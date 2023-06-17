package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.IAbonnementRepo;
import com.example.demo.repository.ICoursRepo;
import com.example.demo.repository.IPisteRepo;
import com.example.demo.repository.ISkieurRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SkieurServiceImpl implements ISkieurService{

    //@Autowired
    private ISkieurRepo iSkieurRepo ;
    private IPisteRepo iPisteRepo ;
    private ICoursRepo iCoursRepo ;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return iSkieurRepo.save(skieur);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return  iSkieurRepo.findAll();
    }

    @Override
    public Skieur getSkieurById(Long id) {
        return iSkieurRepo.findById(id).get();//orElseNull
    }

    @Override
    public void deletteSkieur(Long id) {
        iSkieurRepo.deleteById(id);
    }

    @Override
    public Skieur updateSkieur(Long id) {
        Skieur S = iSkieurRepo.findById(id).get();
        //  return addSkieur(S);
        return iSkieurRepo.save(S);
    }

    @Override
    public Skieur getSkieurByLastNameAndFirstName(String nom, String prenom) {
        return iSkieurRepo.getSkieurByNomAndPrenom(nom, prenom);
    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
      Skieur S= this.getSkieurById(numSkieur);
       Piste P= iPisteRepo.findById(numPiste).get();
       P.getSkieurs().add(S);
       S.getPistes().add(P);
       this.addSkieur(S);
      // iPisteRepo.save(P);
       return S;
    }

    @Override
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
        Cours c = iCoursRepo.findById(numCours).get();
        Inscription insc = new Inscription();
        insc.setCours(c);
        insc.setSkieurs(skieur);
        c.getInscri().add(insc);
        skieur.getInscriptions().add(insc);
        iCoursRepo.save(c);
        this.addSkieur(skieur);
        return null;
    }

    @Override
    public List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbon) {
        return iSkieurRepo.retrieveAllSkieursByTypeAbonnement(typeAbon);
    }

}
