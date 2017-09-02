package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice14MaskFilterView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice14MaskFilterView(Context context) {
        super(context);
    }

    public Practice14MaskFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice14MaskFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        setLayerType(LAYER_TYPE_SOFTWARE, null);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.what_the_fuck);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 用 Paint.setMaskFilter 来设置不同的 BlurMaskFilter
        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.NORMAL));
        // 第一个：NORMAL
        canvas.drawBitmap(bitmap, 100, 50, paint);

        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.INNER));
        // 第二个：INNER
        canvas.drawBitmap(bitmap, bitmap.getWidth() + 200, 50, paint);

        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.OUTER));
        // 第三个：OUTER
        canvas.drawBitmap(bitmap, 100, bitmap.getHeight() + 100, paint);

        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.SOLID));
        // 第四个：SOLID
        canvas.drawBitmap(bitmap, bitmap.getWidth() + 200, bitmap.getHeight() + 100, paint);
    }

    /*
        它的构造方法 BlurMaskFilter(float radius, BlurMaskFilter.Blur style) 中， radius 参数是模糊的范围， style 是模糊的类型。一共有四种：

        NORMAL: 内外都模糊绘制
        SOLID: 内部正常绘制，外部模糊
        INNER: 内部模糊，外部不绘制
        OUTER: 内部不绘制，外部模糊（什么鬼？）
    */
//另一个子类悬浮雕
//        paint.setMaskFilter(new EmbossMaskFilter(new float[]{0, 1, 1}, 0.2f, 8, 10));
/*    它的构造方法 EmbossMaskFilter(float[] direction, float ambient, float specular, float blurRadius) 的参数里，
    direction 是一个 3个元素的数组，指定了光源的方向；
    ambient 是环境光的强度，数值范围是 0到 1；
    specular 是炫光的系数；
    blurRadius 是应用光线的范围。*/

}
