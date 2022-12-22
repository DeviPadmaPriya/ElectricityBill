package com.cg.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.consumer.entity.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer , Long>{

}
