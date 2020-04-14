package com.example.login.validation;

interface ValidationView {

  void setErrorMsg(String message);

  String getValidationText();

  void clearError();
}

class FieldValidationException extends  Exception {
  String message;
  ValidationView view;
  FieldValidationException(String m, ValidationView v) {
    super(m);
    message = m;
    view = v;
  }
}
