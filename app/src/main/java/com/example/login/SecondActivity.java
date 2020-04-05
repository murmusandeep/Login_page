package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    Button btnLogin1;
    Button btnLogin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        btnLogin1 = findViewById(R.id.btn_login1);
        btnLogin1.setOnClickListener(this);

        btnLogin2 = findViewById(R.id.btn_login2);
        btnLogin2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        EditText passwordFromEditText = (EditText) findViewById(R.id.input_password);
        EditText emailFromEditText = (EditText) findViewById(R.id.input_email);
        String password = passwordFromEditText.getText().toString();
        String email = emailFromEditText.getText().toString();

        validatePassword(password,email);
        switch (v.getId())
        {
            case R.id.btn_login:
                //Toast.makeText(this,value, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_login1:
                break;

            case R.id.btn_login2:
                break;
        }
    }

    private void validatePassword(String passwordEditText,String emailEditText) {

        if(passwordEditText.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$") && emailEditText.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
        {
            Toast.makeText(SecondActivity.this, "Email and Password are match with regular expression", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(SecondActivity.this, "Either Email or Password are does not match with regular expression", Toast.LENGTH_SHORT).show();
        }
    }

}
