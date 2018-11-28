package com.eLearningcommons.eLearningcommons.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormerDto {

    private long id;
    private String firstName;
    private String lastName;
    private long telephone;
    private String email;
}
