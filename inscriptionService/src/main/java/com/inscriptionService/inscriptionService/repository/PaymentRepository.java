package com.inscriptionService.inscriptionService.repository;

import com.inscriptionService.inscriptionService.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    

}
