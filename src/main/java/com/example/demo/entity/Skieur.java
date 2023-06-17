package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skieur {
    @Id
    private Long numSkieur ;
    private String nomS ;
    private String prenomS ;
    private Date dateNaissance ;
    private String ville ;
    @OneToOne
    private Abonnement abon ;
    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes ;
    @OneToMany(mappedBy = "skieurs")
    private List<Inscription> inscriptions;

}
