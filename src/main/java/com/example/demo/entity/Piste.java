package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Piste {
    @Id
    private Long numPiste ;
    private String nomPiste ;
    @Enumerated(EnumType.STRING)
    private Couleur couleur ;
    private int longueur ;
    private int pente ;
    @ManyToMany
    private List<Skieur> skieurs ;

}
