package com.example.demo.service;

import com.example.demo.entity.Moniteur;
import com.example.demo.entity.Support;

public interface IMoniteurService {
    void addMoniteurAndAssignToCours(Moniteur moniteur , Long id );
    Moniteur findMoniteurPerSupportCours(Support S);
}
