package com.progfish.maze.component;

import android.view.MotionEvent;

/**
 * For things that respond to touch
 * Created by TJ on 2/27/2015.
 */
public interface ITouchable {

    /**
     * Called whenever a touch event can respond
     * @param event A {@link android.view.MotionEvent} that is to be responded to.
     */
    public void onTouch(MotionEvent event);

    /**
     * Determines whether to respond to the touch
     * @param x x-coordinate of the touch
     * @param y y-coordinate of the touch
     * @return Whether this touchable can respond
     */
    public boolean canRespond(int x, int y);

}
