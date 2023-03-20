package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sharedpreferences.databinding.ActivityMainBinding;
import com.example.sharedpreferences.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OpenHomeAcvtivity();

            }
        });
    }

    public void OpenHomeAcvtivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}