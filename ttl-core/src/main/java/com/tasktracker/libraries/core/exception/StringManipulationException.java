package com.tasktracker.libraries.core.exception;

import com.tasktracker.libraries.core.exception.error.StringErrorCode;

/**
 *
 * Created by u6019943 on 06/07/2015.
 */
public class StringManipulationException extends Exception {
    private static final long serialVersionUID = 1L;
    private String errorParameter = null;
    private StringErrorCode errorCode = StringErrorCode.OK;

    public StringManipulationException() {

    }

    public StringManipulationException(String message) {
        super(message);

    }
    public StringManipulationException(StringErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public StringManipulationException(StringErrorCode errorCode, String errorParameter) {
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
    }

    public StringErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(StringErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String errorMessage() {
        switch (errorCode) {
            case OK:
                return "TILT: Should not get here.";
            case STRING_LENGTH_OVERFLOW:
                return String.format("Error: The provided string is not greater than "+this.errorParameter+" characters long.");
        }
        return "";
    }
}
