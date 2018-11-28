package com.inscriptionService.inscriptionService.repository;

import com.inscriptionService.inscriptionService.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    

}
