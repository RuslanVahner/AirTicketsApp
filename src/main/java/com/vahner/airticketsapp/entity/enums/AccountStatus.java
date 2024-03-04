package com.vahner.airticketsapp.entity.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum AccountStatus {
    ACTIVE("ACTIVE"),
    BLOCKED("BLOCKED"),
    REMOVED("REMOVED");

    private final String value;

    AccountStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue(){
        return value;
    }
}