package com.cg.consumer.service;

import java.util.List;

import com.cg.consumer.entity.Consumer;
import com.cg.consumer.exceptions.ConsumerException;

public interface ConsumerService {
	List<Consumer> getAllConsumer() throws ConsumerException;
	Consumer getConsumer(long id) throws ConsumerException;
	Consumer saveConsumer(Consumer consumer) throws ConsumerException;
	Consumer updateConsumer( Consumer consumer) throws ConsumerException;
	void deleteConsumer(long id) throws ConsumerException;

}
