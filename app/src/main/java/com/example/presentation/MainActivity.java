package com.example.presentation;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {
//    Button navigateUp, navigateDown, navigateLeft, navigateRight, select;
    private DisplayManager displayManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVideo();
    }
    private void initVideo() {
        if (displayManager == null) {
            displayManager = (DisplayManager) getSystemService(Context.DISPLAY_SERVICE);
            Display[] displays = displayManager.getDisplays();
            if (displays.length > 1) {
                ScreenPresentation screenPresentation = new ScreenPresentation(MainActivity.this, displays[1]);
                screenPresentation.show();
            }
        }

    }

}
