package com.example.demo.service;


import com.example.demo.entity.Cours;
import com.example.demo.entity.Moniteur;
import com.example.demo.entity.Support;
import com.example.demo.repository.ICoursRepo;
import com.example.demo.repository.IMoniteurRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@AllArgsConstructor
@Service
public class MoniteurServiceImpl implements IMoniteurService{
  @Autowired
    IMoniteurRepo iMoniteurRepo;
  @Autowired
  ICoursRepo iCoursRepo;

    @Override
    public void addMoniteurAndAssignToCours(Moniteur moniteur, Long id) {
      Cours c = iCoursRepo.findById(id).get();
      moniteur.getCoursMoniteur().add(c);
      iMoniteurRepo.save(moniteur);
    }
    @Override
    public Moniteur findMoniteurPerSupportCours(Support S) {
        return iMoniteurRepo.retrieveMoniteurPerSupprtCours(S);

    }
}
