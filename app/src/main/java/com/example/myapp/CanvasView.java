package com.example.myapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CanvasView extends View {
    private Paint paint;
    private float xPosition = 0;
    private float speed = 5;
    private int screenWidth;

    public CanvasView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.GREEN);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        screenWidth = w; // Captura a largura da tela
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Desenha a bolinha
        canvas.drawCircle(xPosition, 200, 50, paint);

        // Atualiza a posição
        xPosition += speed;
        if (xPosition > screenWidth || xPosition < 0) {
            speed = -speed; // Inverte a direção
        }

        // Requer uma nova chamada de desenho
        invalidate();
    }
    }
