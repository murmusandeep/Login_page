package com.example.login.Validator;

import android.widget.EditText;

public class FieldValidationException extends Exception{

    private EditText mTextView;

    public FieldValidationException(String message, EditText textView) {
        super(message);
        mTextView = textView;
    }

    public EditText getTextView() {
        return mTextView;
    }

}
