package com.survivalofjack.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.survivalofjack.myapp;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Layout inicial

       // Referência ao botão
       Button btnPlay = findViewById(R.id.btnPlay);
       btnPLay.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

       Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
  }
});
  }
}
