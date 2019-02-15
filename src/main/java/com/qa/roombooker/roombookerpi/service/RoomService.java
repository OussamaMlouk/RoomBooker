package com.qa.roombooker.roombookerpi.service;

import java.util.List;

import com.qa.roombooker.roombookerapi.persistence.domain.Room;

public interface RoomService {

	List<Room> getRooms();

	Room addRoom(Room room);

}