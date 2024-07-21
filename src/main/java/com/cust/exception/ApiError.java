package com.cust.exception;

import java.time.LocalDateTime;

public class ApiError {
	private LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;

	public ApiError() {
		this.timestamp = LocalDateTime.now();
	}

	public ApiError(int status, String error, String message) {
		this();
		this.status = status;
		this.error = error;
		this.message = message;
	}

	// Getters and Setters

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
