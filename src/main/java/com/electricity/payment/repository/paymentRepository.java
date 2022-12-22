package com.electricity.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electricity.payment.entity.payment;

@Repository
public interface paymentRepository extends JpaRepository<payment, Long>{

}
