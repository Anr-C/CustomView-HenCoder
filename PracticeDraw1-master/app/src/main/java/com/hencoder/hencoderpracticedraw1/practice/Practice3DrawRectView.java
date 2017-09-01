package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    Paint paint = new Paint();

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawRect() 方法画矩形
//        drawRect(float left, float top, float right, float bottom, Paint paint) 画矩形
//        left+bottom==top+right则为正方形
//        left为左边距离y轴的距离 top为上边距离x轴的距离
//        bottom为下边距离x轴的位置 right为右边距离y轴的位置

        canvas.drawRect(350, 200, 700, 550, paint);
    }
}
