package cn.com.cre.smothview.gestures;

/**
 * created by lc on 2019/3/20 0020
 */

import android.view.MotionEvent;



public interface GestureDetector {
    boolean onTouchEvent(MotionEvent var1);

    boolean isScaling();

    boolean isDragging();

    void setOnGestureListener(OnGestureListener var1);
}
