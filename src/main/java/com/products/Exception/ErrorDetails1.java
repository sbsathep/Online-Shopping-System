package com.products.Exception;

import java.util.Date;

public class ErrorDetails1 {
	private Date timestamp;
	private String message;
	private String details;
	public ErrorDetails1(Date timestamp, String message, String details) {
		// TODO Auto-generated constructor stub
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
