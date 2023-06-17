package com.example.demo.controller;

import com.example.demo.entity.Inscription;
import com.example.demo.entity.Support;
import com.example.demo.service.IInscriptionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/inscription")
public class InscriptionRestcontroller {
    IInscriptionService iInscriptionService ;

    @PutMapping("/assignInscriptionToCours/{numInscription}/{numCours}")
    public Inscription assignInscriptionToCours(@PathVariable("numInscription") Long numInsc,@PathVariable("numCours") Long numCours)
    {
        return  iInscriptionService.assignInscriptionToCours(numInsc,numCours);
    }

    @PostMapping("/addInscriptionAndAssignToSkieurAndCours/{numSkieur}/{numCours}")
    public Inscription addInscriptionAndAssignToSkieurAndCours(@RequestBody Inscription inscription,@PathVariable("numSkieur")Long numSkieur, @PathVariable("numCours")Long numCours) {
        Inscription insc = iInscriptionService.addInscriptionAndAssignToSkieurAndCours(inscription,numSkieur,numCours);
        return insc;
    }

    @GetMapping("/numWeeksCourseOfMoniteurBySupport/{numMoniteur}/{support}")
    public List<Integer> numAllWeeksCourseOfMoniteurBySupport(@PathVariable("numMoniteur")Long numMoniteur,@PathVariable("support") Support support) {
        return iInscriptionService.numWeeksCourseOfMoniteurBySupport(numMoniteur,support);
    }
}
