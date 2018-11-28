package com.inscriptionService.inscriptionService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Inscription {
    @Id
    @GeneratedValue
    private long idInscription;
    private Date inscriptionDate;

    private long idCondidate;
    private long idFormation;

    /*public Inscription(long idInscription, Date inscriptionDate, long idCondidate, long idFormation) {
        this.idInscription = idInscription;
        this.inscriptionDate = inscriptionDate;
        this.idCondidate = idCondidate;
        this.idFormation = idFormation;
    }

    public Inscription() {
        // empty constructo
    }*/



    
}
