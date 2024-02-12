package com.vahner.airticketsapp.exception;

public class AirlineNotFoundException extends  RuntimeException{
    public AirlineNotFoundException(String accountNotFound) {
        super("Airline not found" + accountNotFound);
    }
}
