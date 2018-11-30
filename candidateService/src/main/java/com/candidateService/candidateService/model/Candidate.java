package com.candidateService.candidateService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Candidate {
    @Id
    @GeneratedValue
    private long idCondidate;
   
   private String familyName;
   private String name;
   private long phone;
   private String email;

    public Candidate(long idCondidate, String familyName, String name, long phone, String email) {
        this.idCondidate = idCondidate;
        this.familyName = familyName;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Candidate() {
        // empty constructor
    }


    
}
