package com.stfalcon.chatkit.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by kirvis250 on 17.10.17.
 */

public class MessageImageView extends AppCompatImageView {

    public MessageImageView(Context context) {
        super(context);
    }

    public MessageImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MessageImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Path clipPath = new Path();
    RectF rect = null;
    float radius = 36.0f;


    @Override
    protected void onDraw(Canvas canvas) {
        if (rect == null) {
            rect = new RectF(0, 0, this.getWidth(), this.getHeight());
        }

        clipPath.addRoundRect(rect, radius, radius, Path.Direction.CW);
        canvas.clipPath(clipPath);
        super.onDraw(canvas);
    }

}
