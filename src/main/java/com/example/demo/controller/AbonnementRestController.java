package com.example.demo.controller;

import com.example.demo.entity.Abonnement;
import com.example.demo.entity.TypeAbonnement;
import com.example.demo.service.IAbonnementService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/abonnement")
public class AbonnementRestController {

    IAbonnementService iAbonnementService ;

    @GetMapping("/get/{typeAbon}")
    public Abonnement retrieveAbonnementParType(@PathVariable("typeAbon") TypeAbonnement typeAbon ){
        return iAbonnementService.findAbonnementPArType(typeAbon);
    }

    @GetMapping("/get/{d1}/{d2}")
    public Abonnement retrieveAbonnementBetwenDates(@PathVariable("d1") Date d1  , @PathVariable("d2") Date d2 ){
        return iAbonnementService.findAbonnementParDate(d1,d2);
    }






}
