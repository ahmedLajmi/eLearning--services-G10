package com.inscriptionService.inscriptionService;

import com.eLearningCommons.eLearningCommons.commons.dto.CandidateDto;
import com.eLearningCommons.eLearningCommons.commons.dto.FormationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final RestTemplate restTemplate;

    public DataLoader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void run(String... args) throws Exception {

        ResponseEntity<CandidateDto> candidateResponseEntity
                = this.restTemplate.getForEntity(
                "http://product-service/api/products/{id}",
                CandidateDto.class,
                2
        );
        ResponseEntity<FormationDto> formationResponseEntity
                = this.restTemplate.getForEntity(
                "http://product-service/api/products/{id}",
                FormationDto.class,
                2
        );
    }
}
