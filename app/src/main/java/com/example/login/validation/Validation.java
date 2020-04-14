package com.example.login.validation;

import android.content.Context;

abstract class BaseValidation implements Validation {
  Context mContext;
  BaseValidation(Context context) {
    mContext = context;
  }
}

interface Validation {

  String errorMessage = "";
  boolean isValid(String text);
}
