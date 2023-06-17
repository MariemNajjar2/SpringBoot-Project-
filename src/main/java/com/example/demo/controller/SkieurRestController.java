package com.example.demo.controller;

import com.example.demo.entity.Skieur;
import com.example.demo.entity.TypeAbonnement;
import com.example.demo.service.ISkieurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/skieur")
public class SkieurRestController {

    ISkieurService iSkieurService ;

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur s){
        return iSkieurService.addSkieur(s);
    }
    @GetMapping("/get/{id}")
    public Skieur retrieveSkieurById(@PathVariable("id") Long id ){
        return iSkieurService.getSkieurById(id);
    }
    @GetMapping("/getAll")
    public List<Skieur> retrieveAllSkieur(){
        return iSkieurService.getAllSkieur();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id ){
        iSkieurService.deletteSkieur(id);
    }
    @PutMapping("/assignSkieurPiste/{numSkieur}/{numPiste}")
    public void assignSkieurToPiste(@PathVariable("numSkieur") Long numSkieur,@PathVariable("numPiste") Long numPiste ){
        iSkieurService.assignSkieurToPiste(numSkieur,numPiste);
    }
    @GetMapping("/findByType")
    public List<Skieur> retrieveSkieursByTypeAbonnement(@PathVariable("typeAbon") TypeAbonnement typeAbon){
      return  iSkieurService.retrieveSkieursByTypeAbonnement(typeAbon);
    }
}
