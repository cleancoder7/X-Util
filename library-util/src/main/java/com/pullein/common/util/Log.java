package com.pullein.common.util;

import android.content.Context;

/**
 * ProjectName: X-Util
 * ClassName: com.pullein.common.util.Log
 * Author: XG
 * CreateDate: 2019/12/14 19:06
 * Description:打印日志工具类使用时注意调用{@link Log#init(Context, boolean)}设置开关状态
 */
public class Log {
    private static boolean LOG_ENABLE = true;
    private static String TAG = "========LOG=PRINT========";

    public static void init(Context context, boolean logEnable) {
        LOG_ENABLE = logEnable;
        TAG = "======" + context.getPackageName() + "======";
    }

    public static void v(String msg) {
        v(TAG, msg);
    }

    public static void d(String msg) {
        d(TAG, msg);
    }

    public static void i(String msg) {
        i(TAG, msg);
    }

    public static void w(String msg) {
        w(TAG, msg);
    }

    public static void e(String msg) {
        e(TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (LOG_ENABLE && StringUtil.notEmpty(msg)) {
            android.util.Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOG_ENABLE && StringUtil.notEmpty(msg)) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LOG_ENABLE && StringUtil.notEmpty(msg)) {
            android.util.Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LOG_ENABLE && StringUtil.notEmpty(msg)) {
            android.util.Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LOG_ENABLE && StringUtil.notEmpty(msg)) {
            android.util.Log.e(tag, msg);
        }
    }
}
