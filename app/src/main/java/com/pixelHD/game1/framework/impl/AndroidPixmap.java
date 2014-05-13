package com.pixelHD.game1.framework.impl;

/**
 * Created by kernelhunter on 5/14/2014.
 */

import android.graphics.Bitmap;

import com.pixelHD.game1.framework.Graphics.PixmapFormat;
import com.pixelHD.game1.framework.Pixmap;

public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    public int getWidth() {
        return bitmap.getWidth();
    }

    public int getHeight() {
        return bitmap.getHeight();
    }

    public PixmapFormat getFormat() {
        return format;
    }

    public void dispose() {
        bitmap.recycle();
    }
}
