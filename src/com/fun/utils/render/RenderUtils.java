package com.fun.utils.render;

import com.fun.inject.inject.wrapper.impl.gui.GuiWrapper;

public class RenderUtils {
    public static void renderRect(int left, int top, int right, int bottom, int color){
        GuiWrapper.drawRect(left, top, right, bottom, color);
    }
}
