package com.jackhou.jacocodemo.app;

import android.util.Log;

import com.jackhou.jacocodemo.test.FinishListener;

/**
 * Author: JackHou
 * Date: 2020/5/26.
 */
public class InstrumentedActivity extends MainActivity {
    public static String TAG = "InstrumentedActivity";

    private FinishListener mListener;

    public void setFinishListener(FinishListener listener) {
        mListener = listener;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG + ".InstrumentedActivity", "onDestroy()");
        super.finish();
        if (mListener != null) {
            mListener.onActivityFinished();
        }
    }
}
