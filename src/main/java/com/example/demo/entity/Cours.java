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
public class Cours {
    @Id
    private Long numCours ;
    private int niveau ;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours ;
    @Enumerated(EnumType.STRING)
    private Support support ;
    private Float prix ;
    private int creneau ;
    @OneToMany(mappedBy = "cours")
    private List<Inscription>  inscri ;



}
