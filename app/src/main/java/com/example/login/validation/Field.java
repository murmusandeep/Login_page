package com.example.login.validation;

import java.util.ArrayList;
import java.util.List;

class Field {

  ValidationView mValidation;

  Field(ValidationView validationView) {
    mValidation = validationView;
  }

  private String fieldErrorMessage = null;
  private List<Validation> mValidations = new ArrayList<Validation>();

  String getFieldErrorMessage() {
    return fieldErrorMessage;
  }

  Field validate(Validation what, String fieldErrorMessage) {
    mValidations.add(what);
    what.errorMessage = fieldErrorMessage;
    return this;
  }

  @Throws(FieldValidationException::class)
  fun isValid():Boolean

  {
    for (validation in mValidations) {
      if (!validation.isValid(mValidationView.getValidationText())) {
        val errorMessage = validation.errorMessage
        throw FieldValidationException(errorMessage, mValidationView)
      }
    }
    return true
  }

  boolean isValid() {
    for (ValidationView validation : mValidation) {
      if (!validation)
    }
  }
}
