package com.eLearningcommons.eLearningcommons.commons.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {

    private long id;
    private String familyName;
    private String name;
    private long phone;
    private String email;

}
