package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
//画线
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(150, 100, 150, 500, paint);
        canvas.drawLine(150, 500, 1000, 500, paint);
//画矩形
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(170, 497, 250, 500, paint);
        paint.setColor(Color.parseColor("#72B916"));
        canvas.drawRect(280, 480, 360, 500, paint);
        canvas.drawRect(390, 480, 470, 500, paint);
        canvas.drawRect(500, 320, 580, 500, paint);
        canvas.drawRect(610, 230, 690, 500, paint);
        canvas.drawRect(720, 150, 800, 500, paint);
        canvas.drawRect(830, 350, 910, 500, paint);

        //文字
        paint.setColor(Color.WHITE);
        paint.setTextSize(25);
        canvas.drawText("Froyo",180,530,paint);
        canvas.drawText("GB",300,530,paint);
        canvas.drawText("ICS",410,530,paint);
        canvas.drawText("JB",520,530,paint);
        canvas.drawText("KitKat",620,530,paint);
        canvas.drawText("L",760,530,paint);
        canvas.drawText("M",870,530,paint);

        paint.setTextSize(38);
        canvas.drawText("直方图",500,600,paint);
    }
}
