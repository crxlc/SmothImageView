package cn.com.cre.smothview.scroll;

/**
 * created by lc on 2019/3/20 0020
 */
import android.annotation.TargetApi;
import android.content.Context;


@TargetApi(14)
public class IcsScroller extends GingerScroller
{
    public IcsScroller(Context context) {
        super(context);
    }

    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }
}

