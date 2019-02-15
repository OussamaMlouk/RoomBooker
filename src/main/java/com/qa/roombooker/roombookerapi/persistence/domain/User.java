package com.qa.roombooker.roombookerapi.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long userId;
	
	private String userName;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Room room;
	
	public User() {
		
	}

	public User(Long userId, String userName, Room room) {
		this.userId = userId;
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public String toString() {
		return this.userId + this.userName + this.room;
	}
}
