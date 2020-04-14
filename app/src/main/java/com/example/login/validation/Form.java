package com.example.login.validation;

import java.util.ArrayList;
import java.util.List;

class Form {

  private List<Field> mFields = new ArrayList<Field>();

  void addField(Field field) {
    mFields.add(field);
  }

  fun isValid(): Boolean {
    var result = true
    for (field in mFields) {
      try {
        result = result and field.isValid()
        field.mValidationView.clearError()
      } catch (e: FieldValidationException) {
        result = false
        e.view.setErrorMsg(e.message)
      }
    }
    return result
  }

  boolean isValid() {
    boolean result = true;
    for (Field field : mFields) {
      try {
        result = result && field.isValid();
        field.mValidationView.clearError();
      }
    }
    return  result;
  }
}
