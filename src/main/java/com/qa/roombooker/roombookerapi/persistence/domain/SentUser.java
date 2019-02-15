package com.qa.roombooker.roombookerapi.persistence.domain;

public class SentUser {

	private Long userId;

	private String userName;
	
	private SentRoom sentRoom;
	
	public SentUser() {
		
	}
	
	public SentUser(User user) {
		this.userId = user.getUserId();
		this.userName = user.getUserName();
		this.sentRoom = new SentRoom(user.getRoom());
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

	public SentRoom getSentRoom() {
		return sentRoom;
	}

	public void setSentRoom(SentRoom sentRoom) {
		this.sentRoom = sentRoom;
	}
	
	
}
