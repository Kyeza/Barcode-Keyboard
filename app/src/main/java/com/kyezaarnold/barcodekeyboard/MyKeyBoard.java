package com.kyezaarnold.barcodekeyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Kyeza Arnold on 6/12/2016.
 */
public class MyKeyBoard extends Keyboard {

    private Key mEnterKey;
    private Key mSpaceKey;

    /**
     * Stores the current state of the mode change key. Its width will be dynamically updated to
     * match the region of {@link #mModeChangeKey} when {@link #mModeChangeKey} becomes invisible.
     */
    private Key mModeChangeKey;

    /**
     * Stores the current state of the language switch key (a.k.a. globe key). This should be
     * visible while {@link InputMethodManager#//shouldOfferSwitchingToNextInputMethod(IBinder)}
     * returns true. When this key becomes invisible, its width will be shrunk to zero.
     */
    private Key mLanguageSwitchKey;

    public MyKeyBoard(Context context, int xmlLayoutResId) {
        super(context, xmlLayoutResId);
    }

    public MyKeyBoard(Context context, int xmlLayoutResId, int modeId, int width, int height) {
        super(context, xmlLayoutResId, modeId, width, height);
    }


}
