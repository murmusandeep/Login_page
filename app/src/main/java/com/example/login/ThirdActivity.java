package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnLogin1;
    Button btnLogin2;

    EditText passwordFromEditText;
    EditText emailFromEditText;

    String password;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);


        passwordFromEditText = (EditText) findViewById(R.id.input_password);
        emailFromEditText = (EditText) findViewById(R.id.input_email);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                password = passwordFromEditText.getText().toString();
                email = emailFromEditText.getText().toString();
                validatePassword(password,email);

            }
        });

        btnLogin1 = findViewById(R.id.btn_login1);
        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                password = passwordFromEditText.getText().toString();
                email = emailFromEditText.getText().toString();
                validatePassword(password,email);

            }
        });

        btnLogin2 = findViewById(R.id.btn_login2);
        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                password = passwordFromEditText.getText().toString();
                email = emailFromEditText.getText().toString();
                validatePassword(password,email);

            }
        });
    }

    private void validatePassword(String passwordEditText,String emailEditText) {

        if(passwordEditText.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$") && emailEditText.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
        {
            Toast.makeText(ThirdActivity.this, "Email and Password are match with regular expression", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(ThirdActivity.this, "Either Email or Password are does not match with regular expression", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateForm() {
        getContext()?.apply {
            val form = Form()

            form.addField(Field(tilEFName)
                .validate(NotEmpty(this), getString(R.string.name_required))
                .validate(IsValidName(this), getString(R.string.name_valid)))

            form.addField(Field(tilAtvEMail)
                .validate(NotEmpty(this), getString(R.string.email_required))
                .validate(IsEmail(this), getString(R.string.enter_valid_email)))

            form.addField(Field(tilMobileNumber)
                .validate(NotEmpty(this), getString(R.string.enter_valid_phone))
                .validate(IsPhone(this), getString(R.string.enter_valid_phone)))
            return form.isValid()
        }
        return false;
            }
}
