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

        //btnLogin.setOnClickListener(this);
        /*btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Inside Annonymous Class", Toast.LENGTH_SHORT).show();
            }
        });*/
        //btnLogin.setOnClickListener(new InnerClassClickDemo());
        btnLogin.setOnClickListener(new ClickDemo(MainActivity.this));

    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Inside MainActivity", Toast.LENGTH_SHORT).show();
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


    class InnerClassClickDemo implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Inside InnerClassClickDemo", Toast.LENGTH_SHORT).show();
        }
    }
}
