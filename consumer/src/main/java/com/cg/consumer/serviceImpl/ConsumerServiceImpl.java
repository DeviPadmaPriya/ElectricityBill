package com.cg.consumer.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.consumer.entity.Consumer;
import com.cg.consumer.exceptions.ConsumerException;
import com.cg.consumer.repository.ConsumerRepository;
import com.cg.consumer.service.ConsumerService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService{
	@Autowired
	ConsumerRepository consumerRepo;

	@Override
	public List<Consumer> getAllConsumer() {
		
		return consumerRepo.findAll();
	}

	@Override
	public Consumer getConsumer(long id) throws ConsumerException {
		
		Optional<Consumer> Id=consumerRepo.findById(id);
		Consumer consumer = Id.get();
		
		//System.out.println(consumer);
		return consumer;
	}

	@Override
	public Consumer saveConsumer(Consumer consumer) {	
				Consumer consumers= consumerRepo.save(consumer);
		
		return consumers;
		
	}

	@Override
	public Consumer updateConsumer(Consumer consumer) {	
		
		Consumer consumers= consumerRepo.save(consumer);
		
		return consumers;
	}

	@Override
	public void deleteConsumer(long id) {
		
		consumerRepo.deleteById(id);
		//return "consumer with " + id + "deleted";
		
	}
	

}
