package cn.com.cre.smothview.gestures;

/**
 * created by lc on 2019/3/20 0020
 */
public interface OnGestureListener {
    void onDrag(float var1, float var2);

    void onFling(float var1, float var2, float var3, float var4);

    void onScale(float var1, float var2, float var3);
}
