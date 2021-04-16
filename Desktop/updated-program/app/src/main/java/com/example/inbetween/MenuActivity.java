package com.example.inbetween;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_menu);

        final MediaPlayer menuRing = MediaPlayer.create(MenuActivity.this, R.raw.menumusic);
        menuRing.setLooping(true);
        menuRing.start();

        Button btnPlay = findViewById(R.id.btnPlay);
        Button btnSetting = findViewById(R.id.btnSet);
        Button btnGuide = findViewById(R.id.btnGuide);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuRing.stop();
                openGameView();
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingView();
            }
        });

        btnGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuideView();
            }
        });
    }

    public void openGameView() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);

    }

    public void openSettingView() {
        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }

    public void openGuideView() {

    }

}