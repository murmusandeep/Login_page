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

    EditText myEditText;
    String stringEditText;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
        EditText editText = (EditText) findViewById(R.id.input_password);
        String value = editText.getText().toString();

    }


    @Override
    public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.input_password);
        String value = editText.getText().toString();
        validatePassword(value);
        switch (v.getId())
        {
            case R.id.btn_login:
                //Toast.makeText(this,value, Toast.LENGTH_LONG).show();
            break;
        }
    }

    private void validatePassword(String stringEditText) {
        int smallChar = 0,bigChar = 0,number = 0,specialChar = 0;
        for( int i = 0 ;i<stringEditText.length(); i++)
        {
            if(stringEditText.charAt(i) >= 'a' && stringEditText.charAt(i) <= 'z')
            {
                smallChar++;
            }
            if(stringEditText.charAt(i) >= 'A' && stringEditText.charAt(i) <= 'Z')
            {
                bigChar++;
            }
            if(Character.isDigit(stringEditText.charAt(i)))
            {
                number++;
            }
            else
            {
                specialChar++;
            }
        }

        if(smallChar == 0 || bigChar == 0 || number == 0 || specialChar == 0)
        {
            Toast.makeText(MainActivity.this, "Password Not Strong", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Password Strong", Toast.LENGTH_SHORT).show();
        }
    }
}
