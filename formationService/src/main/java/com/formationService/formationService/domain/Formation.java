package com.formationService.formationService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Formation {
    @Id
    @GeneratedValue
    private long idFormation;
    
    private long idInscription;
    private long idCondidate;
    
    private String name;
    private Date startDate;
    private Date endDate;
    private float price;

    @ManyToMany
    private List<Former> formers;

    public Formation(long idFormation, long idInscription, long idCondidate, String name, Date startDate, Date endDate, float price, List<Former> formers) {
        this.idFormation = idFormation;
        this.idInscription = idInscription;
        this.idCondidate = idCondidate;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.formers = formers;
    }

    public Formation() {
        //empty constructure
    }
    
    
    
}
