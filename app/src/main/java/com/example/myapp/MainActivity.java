package com.example.myapp;

   import androidx.appcompat.app.AppCompatActivity;
   import android.os.Bundle;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // aintiga activity  setContentView(R.layout.activity_main);
        CanvasView canvasView = new CanvasView(this);
        setContenteView(canvasView); //Define o Canvas como a interface da Activity
    }
}
