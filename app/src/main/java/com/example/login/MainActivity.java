package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.Validator.Field;
import com.example.login.Validator.Form;
import com.example.login.Validator.Validations.IsEmail;
import com.example.login.Validator.Validations.NotEmpty;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private EditText mEmail;
    private EditText mPassword;
    private Button btnLogin;

    private Form mForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFields();
        initValidationForm();
        initCallbacks();

    }

    private void initFields() {
        mEmail = (EditText) findViewById(R.id.input_email);
        mPassword = (EditText) findViewById(R.id.input_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }

    private void initValidationForm() {
        mForm = new Form(this);
        mForm.addField(Field.using(mEmail).validate(NotEmpty.build(this)).validate(IsEmail.build(this)));
        mForm.addField(Field.using(mPassword).validate(NotEmpty.build(this)).validate(IsEmail.build(this)));
    }

    private void initCallbacks() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
    }

    private void submit() {
        if (mForm.isValid()) {
            //   Crouton.makeText(this, getString(R.string.sample_activity_form_is_valid), Style.CONFIRM).show();
            Toast.makeText(this, getString(R.string.sample_activity_form_is_valid), Toast.LENGTH_LONG).show();
        }
    }

}
