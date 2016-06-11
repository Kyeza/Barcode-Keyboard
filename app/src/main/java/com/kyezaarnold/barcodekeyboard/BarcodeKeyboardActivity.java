package com.kyezaarnold.barcodekeyboard;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.KeyboardView;
import android.view.View;

/**
 * Created by Kyeza Arnold on 6/12/2016.
 */
public class BarcodeKeyboardActivity extends InputMethodService
    implements KeyboardView.OnKeyboardActionListener {

    MyKeyBoard myKeyBoard;

    @Override
    public View onCreateInputView() {
        BarcodeKeyboardView barcodeKeyboardView =
                (BarcodeKeyboardView) getLayoutInflater().inflate(R.layout.activity_barcode_keyboard, null);
        barcodeKeyboardView.setOnKeyboardActionListener(this);
        barcodeKeyboardView.setKeyboard(myKeyBoard);
        return barcodeKeyboardView;
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {

    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
