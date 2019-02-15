package com.qa.roombooker.roombookerapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.qa.roombooker.roombookerpi.service.RoomService;

@CrossOrigin
@RequestMapping("${path.base}")
@RestController
public class RoomRest {

	@Autowired
	private RoomService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${url.room")
	private String roomUrl;
	
	
}
