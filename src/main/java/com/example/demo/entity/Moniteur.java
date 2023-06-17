package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Moniteur {
    @Id
    private Long numMoniteur ;
    private String nomM ;
    private String prenomM ;
    private LocalDate dateRecru ;
    @OneToMany
    private List<Cours> coursMoniteur ;
}
