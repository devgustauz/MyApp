package com.survivalofjack.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Layout inicial

       // Referência ao botão
       Button btnPlay = findViewById(R.id.btnPlay);
       btnPlay.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Botão Play Clicado", Toast.LENGTH_SHORT).show();
  }
});
  }
}
