package com.survivalofjack.myapp;

 import android.content.Content;
 import android.graphics.Canvas;
 import android.view.View;

public class CanvasView extends View {
  public CanvasView(Context context) {
    super(context);
 }

 @Override
 protected void onDraw(Canvas canvas) {
   super.onDraw(canvas);
  }
}
