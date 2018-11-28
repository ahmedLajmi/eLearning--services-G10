package com.formationService.formationService.repository;

import com.formationService.formationService.domain.Former;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormerRepository extends JpaRepository<Former, Long>{
    List<Former> findByName(String firstName,String secondName);
}
