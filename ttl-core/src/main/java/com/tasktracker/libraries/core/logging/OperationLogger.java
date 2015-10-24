package com.tasktracker.libraries.core.logging;

import com.google.gson.Gson;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationLogger {

	private Logger logger = Logger.getLogger(OperationLogger.class.getName());
	private LoggingInfo loggingInfo;
	private Gson gson = new Gson();
	private boolean isError=false;

	public OperationLogger(String operationCode, boolean isError){
		loggingInfo = new LoggingInfo();
		loggingInfo.setCode(operationCode);
		loggingInfo.setStartedTime(Instant.now());
		this.isError=isError;
	}

	public void operationFinished() {
		loggingInfo.setTimeExecuted(String.valueOf(ChronoUnit.MILLIS.between(loggingInfo.getStartedTime(), Instant.now())));
		if(isError) {
            logger.log(Level.SEVERE, this.gson.toJson(loggingInfo));
		} else {
            logger.info(this.gson.toJson(loggingInfo));
		}
	}
}
