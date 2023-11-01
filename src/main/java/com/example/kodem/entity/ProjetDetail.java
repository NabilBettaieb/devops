package com.example.kodem.entity;

import javax.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "projetdetail")
public class ProjetDetail implements Serializable {
    @Id
    @Column(name="id")
    private int idDetail;// Clé primaire

    private String description;
    private String technologie;
    private Long cout;
    private Date dateDebut;

    @OneToOne(mappedBy="projetDetail")
    private Projet projet ;

}
