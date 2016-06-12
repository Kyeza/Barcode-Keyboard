package com.kyezaarnold.barcodekeyboard;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.AudioManager;
import android.view.View;

/**
 * Created by Kyeza Arnold on 6/12/2016.
 */
public class BarcodeKeyboard extends InputMethodService
    implements KeyboardView.OnKeyboardActionListener {

    private BarcodeKeyboardView mBarcodeKeyboardView;
    private MyKeyBoard myKeyBoard;

//    Shows if CAPS is enabled
    private boolean caps = false;

    @Override
    public View onCreateInputView() {

        mBarcodeKeyboardView =
                (BarcodeKeyboardView) getLayoutInflater().inflate(R.layout.barcode_keyboard, null);

        myKeyBoard = new MyKeyBoard(this, R.xml.qwerty);
        mBarcodeKeyboardView.setKeyboard(myKeyBoard);
        mBarcodeKeyboardView.setOnKeyboardActionListener(this);

        return mBarcodeKeyboardView;
    }

    private void playClick(int keyCode) {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        switch (keyCode){
            case 32:
                audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR);
                break;
            case Keyboard.KEYCODE_DONE:
            case 10:
                audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN);
                break;
            case Keyboard.KEYCODE_DELETE:
                audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE);
                break;
            default:
                audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
        }
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
