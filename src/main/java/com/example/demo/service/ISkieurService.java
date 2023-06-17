package com.example.demo.service;

import com.example.demo.entity.Skieur;
import com.example.demo.entity.TypeAbonnement;

import java.util.List;

public interface ISkieurService {

    public Skieur addSkieur(Skieur skieur);
    public List<Skieur> getAllSkieur();
    public Skieur getSkieurById(Long id);
    public void deletteSkieur(Long  id );
    public Skieur updateSkieur(Long id);
    public Skieur getSkieurByLastNameAndFirstName(String nom , String prenom);
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste );
    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement);


}
