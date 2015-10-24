package com.tasktracker.libraries.core.logging;

public enum LoggingCodes {

	TTS_TASK_LIST ("----------- TTS-TASK-SERVICE: List Task Operation for user: %1"),
	TTS_TASK_GET ("----------- TTS-TASK-SERVICE: Get Task Operation"),
	TTS_TASK_ADD ("----------- TTS-TASK-SERVICE: Add Task Operation"),
	TTS_TASK_DELETE ("----------- TTS-TASK-SERVICE: Delete Task Operation"),
	TTS_TASK_UPDATE ("----------- TTS-TASK-SERVICE: Update Task Operation"),
	TTS_TASK_DB_OPENING_CONN_EXCEPTION("----------- TTS_TASK_DB_OPENING_CONN_EXCEPTION: Error opening connection to database: %1"),
	TTS_TASK_DB_CLOSING_CONN_EXCEPTION("----------- TTS_TASK_DB_CLOSING_CONN_EXCEPTION: Error closing connection to database: %1"),

    TTS_TRACK_ADD ("----------- TTS-TRACK-SERVICE: Add Track Operation"),

    TTS_API_DB_ADD_TASK_EXCEPTION("----------- TTS_TASK_DB_ADD_TASK_EXCEPTION: Error inserting on the table TTS_TASK: %1"),
	TTS_API_DB_LIST_TASK_EXCEPTION("----------- TTS_TASK_DB_LIST_TASK_EXCEPTION: Error listing content on the table TTS_TASK: %1"),
	TTS_API_DB_GET_TASK_EXCEPTION("----------- TTS_TASK_DB_GET_TASK_EXCEPTION: Error getting the task %1: %2"),
	TTS_API_DB_DELETE_TASK_EXCEPTION("----------- TTS_TASK_DB_DELETE_TASK_EXCEPTION: Error deleting the task %1: %2"),
	TTS_API_DB_UPDATE_TASK_EXCEPTION("----------- TTS_TASK_DB_UPDATE_TASK_EXCEPTION: Error updating the task %1: %2"),

    TTA_API_CREATE_URI_EXCEPTION("----------- TTA-API: Create URI exception: %1"),
	TTS_TASK_CREATE_URI_EXCEPTION("----------- TTS-TASK: Create URI exception: %1"),
	TTA_API_LOADING_CONFIG("----------- TTA-API: Exception loading properties: %1"),
    TTS_TRACK_LOADING_CONFIG("----------- TTS-TASK: Exception loading properties: %1"),

	TTL_REST_GET("----------- TTL-REST: GET request: %1 with response: %2"),
	TTL_REST_GET_EXCEPTION("----------- TTL-REST: GET exception: %1"),
    TTL_REST_POST("----------- TTL-REST: POST request: %1 with response: %2"),
    TTL_REST_POST_EXCEPTION("----------- TTL-REST: POST exception: %1"),
    TTL_REST_DELETE("----------- TTL-REST: DELETE request: %1 with response: %2"),
    TTL_REST_DELETE_EXCEPTION("----------- TTL-REST: DELETE exception: %1"),
    TTL_REST_PUT("----------- TTL-REST: UPDATE request: %1 with response: %2"),
    TTL_REST_PUT_EXCEPTION("----------- TTL-REST: UPDATE exception: %1");

	private final String code;

	LoggingCodes(String code) {
        this.code = code;
	}

	public String getCode(){
        return code;
    }
}
