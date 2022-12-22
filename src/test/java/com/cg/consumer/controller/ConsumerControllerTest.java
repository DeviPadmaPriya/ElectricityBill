package com.cg.consumer.controller;


import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.consumer.entity.Consumer;
import com.cg.consumer.service.ConsumerService;


@ExtendWith(MockitoExtension.class)
public class ConsumerControllerTest {
	@InjectMocks
	ConsumerController consumercontroller;
	
	@Mock
	ConsumerService consumerservice;
	
	@Test
	void getAllConsumerTest() {
		List<Consumer> consumers = createConsumerMockData();
		when(consumerservice.getAllConsumer()).thenReturn(consumers);
		
		List<Consumer> consumersList = consumercontroller.getAllConsumer();
		assert(consumers.size() == consumersList.size());
	}
	
	@Test
	void saveConsumerTest() {
		Consumer consumer = ConsumerMockData();
		when(consumerservice.saveConsumer(consumer)).thenReturn(consumer);
		
		Consumer consumersList = consumercontroller.saveConsumer(consumer);
		assert(consumer.getId() == consumersList.getId());
		
	}
	
	
	@Test
	void deleteConsumerTest() {
		long id = 1;
		String msg = "Successfully Deleted consumer";
		doNothing().when(consumerservice).deleteConsumer(id);
		String message = consumercontroller.deleteConsumer(id);
		assert(message.equals(msg));
	}
	
	

	private List<Consumer> createConsumerMockData() {
		List<Consumer> consumer = new ArrayList<>();
		Consumer consumerDto = new Consumer();
		consumerDto.setId(1);
		consumerDto.setFirstName("klsjdlksaj");
		consumerDto.setLastName("klsjdlksaj");
		consumerDto.setMobile((long) 1234567890);
		consumerDto.setAddress("klsjdlksaj");
		consumerDto.setEmail("klsjdlksaj@gmail.com");
		consumerDto.setUserName("klsjdlksaj");
		consumerDto.setPassword("klsjdlksaj");
		consumer.add(consumerDto);
		
		return consumer;
	}
	
	private Consumer ConsumerMockData() {
		Consumer consumerDto = new Consumer();
		consumerDto.setId(1);
		consumerDto.setFirstName("klsjdlksaj");
		consumerDto.setLastName("klsjdlksaj");
		consumerDto.setMobile((long) 1234567890);
		consumerDto.setAddress("klsjdlksaj");
		consumerDto.setEmail("klsjdlksaj@gmail.com");
		consumerDto.setUserName("klsjdlksaj");
		consumerDto.setPassword("klsjdlksaj");
		//consumer.add(consumerDto);
		
		return consumerDto;
	}
	

}
