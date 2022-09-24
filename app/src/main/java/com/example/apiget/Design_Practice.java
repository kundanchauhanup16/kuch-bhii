package com.example.apiget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Design_Practice extends AppCompatActivity {
    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_practice);
        textInputLayout=findViewById(R.id.textInputLayout);
        textInputEditText=findViewById(R.id.textInputEditText);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Design_Practice.this, "Badshah", Toast.LENGTH_SHORT).show();
            }

        });
        textInputEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textInputEditText.getText().toString().isEmpty()){
                    textInputEditText.setError("working");
                }
            }
        });
    }
}