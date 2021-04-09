package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btnMyProfile = findViewById(R.id.btnProfile);
        btnMyProfile.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {Profile();}});
    }

    public void Profile()
    {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}