package com.survivalofjack.myapp;

 import android.app.Activity;
 import android.os.Bundle;

public class GameActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(new CanvasView(this));// Exibe o Canvas
   }
}
