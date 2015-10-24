package com.tasktracker.libraries.core.logging;

import java.io.Serializable;
import java.time.Instant;

public class LoggingInfo implements Serializable{
	
	private String code;
	private Instant startedTime;
	private String timeExecuted;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTimeExecuted() {
		return timeExecuted;
	}
	
	public void setTimeExecuted(String timeExecuted) {
		this.timeExecuted = timeExecuted;
	}

	public Instant getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(Instant startedTime) {
		this.startedTime = startedTime;
	}
}
