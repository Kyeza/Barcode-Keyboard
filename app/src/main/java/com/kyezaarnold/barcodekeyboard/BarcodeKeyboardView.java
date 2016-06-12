package com.kyezaarnold.barcodekeyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodSubtype;

/**
 * Created by Kyeza Arnold on 6/12/2016.
 */
public class BarcodeKeyboardView extends KeyboardView {

    static final int KEYCODE_OPTIONS = -100;
    static final int KEYCODE_LANGUAGE_SWITCH = -101;

    public BarcodeKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BarcodeKeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected boolean onLongPress(Keyboard.Key popupKey) {
        if (popupKey.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
            return true;
        } else {
            return super.onLongPress(popupKey);
        }
    }

    void setSubtypeOnSpaceKey(final InputMethodSubtype subtype) {
        final MyKeyboard keyboard = (MyKeyboard) getKeyboard();
        keyboard.setSpaceIcon(getResources().getDrawable(subtype.getIconResId()));
        invalidateAllKeys();
    }
}
