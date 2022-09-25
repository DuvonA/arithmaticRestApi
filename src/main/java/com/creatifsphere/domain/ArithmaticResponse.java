package com.creatifsphere.domain;

public class ArithmaticResponse {

	private String errorMessage;
	private Float result;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Float getResult() {
		return result;
	}
	public void setResult(Float result) {
		this.result = result;
	}

	//set results stores results from controller class in results variable
	//get results returns the value of
	
}
