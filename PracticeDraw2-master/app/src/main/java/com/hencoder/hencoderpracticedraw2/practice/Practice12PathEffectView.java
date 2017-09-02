package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.SumPathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice12PathEffectView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();
    PathEffect pathEffect;

    public Practice12PathEffectView(Context context) {
        super(context);
    }

    public Practice12PathEffectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice12PathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setStyle(Paint.Style.STROKE);

        path.moveTo(50, 100);
        path.rLineTo(50, 100);
        path.rLineTo(80, -150);
        path.rLineTo(100, 100);
        path.rLineTo(70, -120);
        path.rLineTo(150, 80);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 Paint.setPathEffect() 来设置不同的 PathEffect

        pathEffect = new CornerPathEffect(20);
        paint.setPathEffect(pathEffect);
        // 第一处：CornerPathEffect 把所有拐角变成圆角。
        canvas.drawPath(path, paint);

        canvas.save();
        canvas.translate(500, 0);

        pathEffect = new DiscretePathEffect(20, 5);
        paint.setPathEffect(pathEffect);
        // 第二处：DiscretePathEffect 把线条进行随机的偏离，让轮廓变得乱七八糟。乱七八糟的方式和程度由参数决定
        canvas.drawPath(path, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(0, 200);
        pathEffect = new DashPathEffect(new float[]{20,10,5,10}, 0);
        paint.setPathEffect(pathEffect);
        // 第三处：DashPathEffect 使用虚线来绘制线条
        canvas.drawPath(path, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(500, 200);

        Path dashPath = new Path();
        dashPath.lineTo(20, -30);
        dashPath.lineTo(40, 0);
        dashPath.close();
        pathEffect = new PathDashPathEffect(dashPath, 40, 0,
                PathDashPathEffect.Style.MORPH);
        paint.setPathEffect(pathEffect);
        // 第四处：PathDashPathEffect 这个方法比 DashPathEffect 多一个前缀 Path ，所以顾名思义，它是使用一个 Path 来绘制「虚线」。
        canvas.drawPath(path, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(0, 400);
        PathEffect dashEffect = new DashPathEffect(new float[]{20, 10}, 0);
        PathEffect discreteEffect = new DiscretePathEffect(20, 5);
        pathEffect=new SumPathEffect(dashEffect,discreteEffect);
        paint.setPathEffect(pathEffect);
        // 第五处：SumPathEffect 这是一个组合效果类的 PathEffect 。它的行为特别简单，就是分别按照两种 PathEffect 分别对目标进行绘制。
        canvas.drawPath(path, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(500, 400);
        pathEffect = new ComposePathEffect(dashEffect, discreteEffect);
        paint.setPathEffect(pathEffect);
        // 第六处：ComposePathEffect 这也是一个组合效果类的 PathEffect 。不过它是先对目标 Path 使用一个 PathEffect，然后再对这个改变后的 Path 使用另一个 PathEffect。
        canvas.drawPath(path, paint);
        canvas.restore();
    }
}
