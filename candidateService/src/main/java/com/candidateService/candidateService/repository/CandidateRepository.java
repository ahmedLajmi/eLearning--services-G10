package com.candidateService.candidateService.repository;

import com.candidateService.candidateService.model.Candidate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{
    List<Candidate> findByName(String familyName,String name);
}
