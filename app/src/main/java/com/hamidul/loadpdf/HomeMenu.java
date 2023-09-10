package com.hamidul.loadpdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class HomeMenu extends AppCompatActivity {

    LinearLayout b1,b2,b3;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.home_menu);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pdf = "cv_ujjal.pdf";
                mediaPlayer = MediaPlayer.create(HomeMenu.this,R.raw.button_click_1);
                mediaPlayer.start();
                startActivity(new Intent(HomeMenu.this,MainActivity.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pdf = "hamidul.pdf";
                mediaPlayer = MediaPlayer.create(HomeMenu.this,R.raw.button_click_1);
                mediaPlayer.start();
                startActivity(new Intent(HomeMenu.this,MainActivity.class));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pdf = "memo.pdf";
                mediaPlayer = MediaPlayer.create(HomeMenu.this,R.raw.button_click_1);
                mediaPlayer.start();
                startActivity(new Intent(HomeMenu.this,MainActivity.class));
            }
        });

    }


}