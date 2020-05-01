package com.example.login.Validator.Validations;

public interface Validation {

    String getErrorMessage();

    boolean isValid(String text);
}
