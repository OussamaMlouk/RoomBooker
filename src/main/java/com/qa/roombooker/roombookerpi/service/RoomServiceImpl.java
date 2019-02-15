package com.qa.roombooker.roombookerpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.roombooker.roombookerapi.persistence.domain.Room;
import com.qa.roombooker.roombookerapi.persistence.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository repo;
	
	@Override
	public List<Room> getRooms(){
		return repo.findAll();
	}
	
	@Override
    public Room addRoom(Room room) {
        return repo.save(room);
    }
}
