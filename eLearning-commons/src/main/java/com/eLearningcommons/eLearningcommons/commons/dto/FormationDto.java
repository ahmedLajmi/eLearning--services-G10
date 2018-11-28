package com.eLearningcommons.eLearningcommons.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormationDto {

    private long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private float price;

}
