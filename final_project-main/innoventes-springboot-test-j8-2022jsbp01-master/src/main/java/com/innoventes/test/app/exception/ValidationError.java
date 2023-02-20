package com.innoventes.test.app.exception;

public class ValidationError implements AbstractError {
	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(Object invalidValue) {
		this.invalidValue = invalidValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String objectName;
	private String field;
	private Object invalidValue;
	private String message;

	public ValidationError(String objectName, String message) {
		this.objectName = objectName;
		this.message = message;
	}
}
