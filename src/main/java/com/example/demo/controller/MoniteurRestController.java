package com.example.demo.controller;

import com.example.demo.entity.Moniteur;
import com.example.demo.entity.Support;
import com.example.demo.service.IMoniteurService;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/moniteur")
public class MoniteurRestController {

    IMoniteurService iMoniteurService;
    @GetMapping("/get/{support}")
    public Moniteur retrieveMoniteurPerSupportCours(@PathVariable("support") Support support ){
        return iMoniteurService.findMoniteurPerSupportCours(support);
    }
}
