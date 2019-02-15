package com.qa.roombooker.roombookerapi.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue
	private Long roomId;

	private String roomName;

	private String floor;

	@Column(name = "available")
	private boolean available = true;

	public Room() {

	}

	public Room(Long roomId, String roomName, String floor, boolean available) {
		this.roomId = roomId;
		this.roomName = roomName;
		this.floor = floor;
		this.available = available;
	}

	public Long getRoomId() {
		return roomId;
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

	public String toString() {
		return this.roomId + this.roomName + this.floor + this.available;
	}

}
