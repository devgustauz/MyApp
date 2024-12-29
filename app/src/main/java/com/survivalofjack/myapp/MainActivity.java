package com.survivalofjack.myapp;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CanvasView canvasView = new CanvasView(this);
        setContentView(canvasView);
    }
}
