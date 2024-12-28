package com.example.myapp;

 import android.content.Context;
 import android.graphics.Canvas;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.view.View;

public class CanvasView extends View {

     private Paint paint;
     private float xPosition = 0; //Círculo inicia na Esquerda

    public CanvasView(Context context) {
     super(context);
     paint = new Paint();
     paint.setColor(Color.BLUE); //Cor do Círculo
  }
  @Overrride
  protected void onDraw(Canvas canvas) {
      super.onDraw(canvas);
 //Desenha um círculo na posição x, 200 com raio de 50
      canvas.draw.Circle(xPosition, 200, 50, paint);

 //Atualiza a posição do círculo
      xPosition += 5;
      if (xPosition > getWidth()) {
           xPosition = 0; //Reseta ao sair da tela
      }

      invalidate(); //Redesenha a tela a cada frame
 }
}
