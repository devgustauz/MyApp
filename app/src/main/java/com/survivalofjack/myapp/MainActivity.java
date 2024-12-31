package com.survivalofjack.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       requestWindowFeature(Window.FEATURE_NO_TITLE);

getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main); // Layout inicial

       // Botão inicia o jogo
       Button startGameButton = findViewById(R.id.startGameButton);
       startGameButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, GameActivity.class);
      startActivity(intent);
  }
});
  }
}
