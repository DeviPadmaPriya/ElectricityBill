package com.electricity.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electricity.bill.entity.bill;

public interface billRepository extends JpaRepository<bill,Long>{

}
