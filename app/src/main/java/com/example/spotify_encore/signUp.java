package com.example.spotify_encore;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signUp extends AppCompatActivity {
    private TextView textUsernameSignUp;
    private TextView textEmailSignUp;
    private TextView textPasswordSignUp;
    private EditText editUsernameSignUp;
    private EditText editTextEmailSignUp;
    private EditText editTextPasswordSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    private void creatAccount() {
        textUsernameSignUp = findViewById(R.id.textUsernameSignUp);
    }

}
