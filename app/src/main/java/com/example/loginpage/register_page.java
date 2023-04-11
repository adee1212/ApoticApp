package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_page extends AppCompatActivity {

    private EditText editTextName, editTextPassword, editTextRePassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register_page);

        // Initialize views
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextRePassword = findViewById(R.id.editTextRePassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Set click listener for register button
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform register action here
                String name = editTextName.getText().toString().trim();
                String email = editTextPassword.getText().toString().trim();
                String password = editTextRePassword.getText().toString().trim();

                // Validate inputs
                if (TextUtils.isEmpty(name)) {
                    editTextName.setError("Name is required");
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    editTextPassword.setError("Password is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    editTextRePassword.setError("Ulangi Password is required");
                    return;
                }

                // Perform register action here, e.g. send data to server
                // ...
            }
        });
    }
}