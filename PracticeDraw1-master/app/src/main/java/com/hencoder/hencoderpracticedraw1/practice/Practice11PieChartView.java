package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();
    Path path = new Path(); // 初始化 Path 对象

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setStyle(Paint.Style.FILL); // 填充模式

        //marshmallow
        paint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(280, 100, 780, 600, 0, -55, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(760,250);
        path.lineTo(790,230);
        path.rLineTo(60,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Marshmallow", 855, 230, paint);

        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //froyo
        paint.setColor(Color.parseColor("#506E7A"));
        canvas.drawArc(280, 100, 780, 600, 0, 2, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(780,355);
        path.lineTo(845,355);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Froyo", 855, 355, paint);

        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //gingerbread
        paint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(280, 100, 780, 600, 2, 10, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(780,370);
        path.lineTo(805,370);
        path.lineTo(825,385);
        path.rLineTo(20,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Gingerbread", 855, 385, paint);


        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //ice cream sandwich
        paint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(280, 100, 780, 600, 11, 5, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(775,410);
        path.lineTo(805,410);
        path.lineTo(825,425);
        path.rLineTo(20,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Ice Cream Sandwich", 855, 425, paint);

        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //jelly bean
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(280, 100, 780, 600, 17, 60, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(705,530);
        path.lineTo(730,550);
        path.rLineTo(70,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Jelly Bean", 805, 550, paint);

        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //kitkat
        paint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(280, 100, 780, 600, 79, 98, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(365,540);
        path.lineTo(350,550);
        path.rLineTo(-50,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("KitKat", 225, 550, paint);

        //为方便代码阅读,每次都重新设置style
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //lollipop
        paint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(265, 85, 765, 585, -60, -120, true, paint); // 绘制扇形

        //描述
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(365,120);
        path.lineTo(350,100);
        path.rLineTo(-50,0);
        canvas.drawPath(path,paint);

        //描述文字
        paint.setTextSize(25);
        canvas.drawText("Lollipop", 205, 100, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(38);
        canvas.drawText("饼图", 480, 700, paint);


    }
}
