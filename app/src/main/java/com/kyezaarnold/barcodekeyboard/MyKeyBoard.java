package com.kyezaarnold.barcodekeyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;

/**
 * Created by Kyeza Arnold on 6/12/2016.
 */
public class MyKeyBoard extends Keyboard {

    public MyKeyBoard(Context context, int xmlLayoutResId) {
        super(context, xmlLayoutResId);
    }

    public MyKeyBoard(Context context, int xmlLayoutResId, int modeId, int width, int height) {
        super(context, xmlLayoutResId, modeId, width, height);
    }


}
