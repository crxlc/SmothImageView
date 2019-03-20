package cn.com.cre.smothview.gestures;

/**
 * created by lc on 2019/3/20 0020
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;

import cn.com.cre.smothview.Compat;


@TargetApi(5)
public class EclairGestureDetector extends CupcakeGestureDetector
{
    private static final int INVALID_POINTER_ID = -1;
    private int mActivePointerId = -1;
    private int mActivePointerIndex = 0;

    public EclairGestureDetector(Context context) {
        super(context);
    }

    float getActiveX(MotionEvent ev) {
        try {
            return ev.getX(this.mActivePointerIndex);
        } catch (Exception var3) {
            return ev.getX();
        }
    }

    float getActiveY(MotionEvent ev) {
        try {
            return ev.getY(this.mActivePointerIndex);
        } catch (Exception var3) {
            return ev.getY();
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch(action & 255) {
            case 0:
                this.mActivePointerId = ev.getPointerId(0);
                break;
            case 1:
            case 3:
                this.mActivePointerId = -1;
            case 2:
            case 4:
            case 5:
            default:
                break;
            case 6:
                int pointerIndex = Compat.getPointerIndex(ev.getAction());
                int pointerId = ev.getPointerId(pointerIndex);
                if (pointerId == this.mActivePointerId) {
                    int newPointerIndex = pointerIndex == 0 ? 1 : 0;
                    this.mActivePointerId = ev.getPointerId(newPointerIndex);
                    this.mLastTouchX = ev.getX(newPointerIndex);
                    this.mLastTouchY = ev.getY(newPointerIndex);
                }
        }

        this.mActivePointerIndex = ev.findPointerIndex(this.mActivePointerId != -1 ? this.mActivePointerId : 0);
        return super.onTouchEvent(ev);
    }
}
