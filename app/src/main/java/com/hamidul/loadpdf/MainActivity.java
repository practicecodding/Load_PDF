package com.hamidul.loadpdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MainActivity extends AppCompatActivity {
    PDFView pdfView;
    LottieAnimationView animationView;
    public static String pdf="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        animationView = findViewById(R.id.animationView);

        pdfView.fromAsset(pdf)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        pdfView.setVisibility(View.VISIBLE);
                        animationView.setVisibility(View.GONE);
                    }
                })
                .load();

    }

}