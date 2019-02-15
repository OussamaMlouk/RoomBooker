package com.qa.roombooker.roombookerapi.persistence.domain;

public class SentRoom {
	
	private Long roomId;

	private String roomName;

	private String floor;

	private boolean available;
	
	public SentRoom() {
		
	}

	public SentRoom(Room room) {
		super();
		this.roomId = room.getRoomId();
		this.roomName = room.getRoomName();
		this.floor = room.getFloor();
		this.available = room.isAvailable();
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
