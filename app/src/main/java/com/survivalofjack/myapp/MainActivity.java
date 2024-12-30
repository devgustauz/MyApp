package com.survivalofjack.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import andorid.widget.Butoon;

import com.example.myapplication.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Layout inicial

       // Referência ao botão
       Button btnPlay = findViewById(R.id.btnPlay);

       // Clique no Botão
       btnPLay.set.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

       Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
  }
});
  }
}
