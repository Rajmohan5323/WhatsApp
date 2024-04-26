package com.example.whatsapp;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.whatsapp.databinding.ActivityChatDetailsBinding;


public class ChatDetailsActivity extends AppCompatActivity {

    ActivityChatDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

    }
}