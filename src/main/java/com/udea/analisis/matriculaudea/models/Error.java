package com.udea.analisis.matriculaudea.models;

public class Error {
	public String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Error() {
    }

    public Error(String message) {
        Message = message;
    }
    
}
