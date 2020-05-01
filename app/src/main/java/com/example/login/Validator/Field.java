package com.example.login.Validator;

import android.widget.EditText;

import com.example.login.Validator.Validations.Validation;

import java.util.LinkedList;
import java.util.List;

public class Field {

    private List<Validation> mValidations = new LinkedList<Validation>();
    private EditText mEditText;

    private Field(EditText textView) {
        this.mEditText = textView;
    }

    public static Field using(EditText textView) {
        return new Field(textView);
    }

    public Field validate(Validation what) {
        mValidations.add(what);
        return this;
    }

    public EditText getTextView() {
        return mEditText;
    }

    public boolean isValid() throws FieldValidationException {
        for (Validation validation : mValidations) {
            if (!validation.isValid(mEditText.getText().toString())) {
                String errorMessage = validation.getErrorMessage();
                throw new FieldValidationException(errorMessage, mEditText);
            }
        }
        return true;
    }


}
