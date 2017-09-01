package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    Paint paintCircle1=new Paint();
    //抗锯齿
    Paint paintCircle2=new Paint(Paint.ANTI_ALIAS_FLAG);
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
//        默认实心圆 350 170为圆心 半径为160
        paintCircle1.setColor(Color.BLACK);
        canvas.drawCircle(350,170,160,paintCircle1);

        //设置画笔画线 线宽为3个像素
        paintCircle1.setStyle(Paint.Style.STROKE);
        paintCircle1.setStrokeWidth(3);
        canvas.drawCircle(700,170,160,paintCircle1);

        //设置为填充方式
        paintCircle1.setStyle(Paint.Style.FILL);
        //设置填充颜色
        paintCircle1.setColor(Color.parseColor("#4A90E2"));
        canvas.drawCircle(350,530,160,paintCircle1);

        //开启抗锯齿的线圈圆
        paintCircle2.setStyle(Paint.Style.STROKE);
        paintCircle2.setStrokeWidth(60);
        canvas.drawCircle(700,530,150,paintCircle2);
    }
}
