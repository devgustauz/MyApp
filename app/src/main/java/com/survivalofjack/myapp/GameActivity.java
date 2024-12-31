package com.survivalofjack.myapp;

 import android.app.Activity;
 import android.os.Bundle;
 import android.view.Window;
 import android.view.WindowManager;

public class GameActivity extends Activity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);

   // Oculta barra de título e definir tela cheia
   requestWindowFeature(Window.FEATURE_NO_TITLE);
getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

  setContentView(new CanvasView(this));
 }
}
