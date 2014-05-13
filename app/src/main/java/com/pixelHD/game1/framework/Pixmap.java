package com.pixelHD.game1.framework;

import com.pixelHD.game1.framework.Graphics.PixmapFormat;
/**
 * Created by kernelhunter on 5/13/2014.
 */
public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
