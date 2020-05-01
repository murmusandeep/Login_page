package com.example.login.Validator.Validations;

import android.content.Context;

import com.example.login.R;

public class IsPassword extends BaseValidation {


    private static final String PASSWORD_PATTERN =
            "((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    private IsPassword(Context context) {
        super(context);
    }

    public static Validation build(Context context) {
        return new IsPassword(context);
    }

    @Override
    public String getErrorMessage() {
        return mContext.getString(R.string.zvalidations_not_password);
    }

    @Override
    public boolean isValid(String text) {
        return text.matches(PASSWORD_PATTERN);
    }

}
