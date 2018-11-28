package com.inscriptionService.inscriptionService.service;


import com.inscriptionService.inscriptionService.model.Inscription;
import com.inscriptionService.inscriptionService.repository.InscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InscriptionService {
    
    private final InscriptionRepository inscriptionRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }
    
    public Inscription create(Inscription inscription) {
        return this.inscriptionRepository.save(inscription);
    }
    
    public Inscription update(Inscription inscription) {
        return this.inscriptionRepository.save(inscription);
    }
    
    public List<Inscription> findAll() {
        return this.inscriptionRepository.findAll();
    }
    
    public Inscription findById(long id) {
        return this.inscriptionRepository.findById(id).orElse(null);
    }
    
    /*
    public List<Inscription> findAllByFormation(long id) {
        return this.inscriptionRepository.findAllByIdFormation(id);
    }
    
    public List<Inscription> findAllByCandidate(long id) {
        return this.inscriptionRepository.findAllByIdCondidate(id);
    }
    */
    public void delete(Long id) {
        this.inscriptionRepository.deleteById(id);
    }
}
