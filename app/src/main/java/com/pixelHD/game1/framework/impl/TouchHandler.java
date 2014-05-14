package com.pixelHD.game1.framework.impl;

/**
 * Created by kernelhunter on 5/14/2014.
 */

import java.util.List;

import android.view.View.OnTouchListener;

import com.pixelHD.game1.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
