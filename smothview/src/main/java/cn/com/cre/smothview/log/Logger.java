package cn.com.cre.smothview.log;

/**
 * created by lc on 2019/3/20 0020
 */
public interface Logger
{
    int v(String var1, String var2);

    int v(String var1, String var2, Throwable var3);

    int d(String var1, String var2);

    int d(String var1, String var2, Throwable var3);

    int i(String var1, String var2);

    int i(String var1, String var2, Throwable var3);

    int w(String var1, String var2);

    int w(String var1, String var2, Throwable var3);

    int e(String var1, String var2);

    int e(String var1, String var2, Throwable var3);
}
