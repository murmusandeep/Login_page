package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);

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
        }
    }

    private void validatePassword(String stringEditText,String stringEditText1) {

        if(stringEditText.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$") && stringEditText1.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
        {
            Toast.makeText(MainActivity.this, "Email and Password are match with regular expression", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Either Email or Password are does not match with regular expression", Toast.LENGTH_SHORT).show();
        }
    }
}
