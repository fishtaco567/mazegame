package com.progfish.maze;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

import java.util.LinkedList;
import java.util.Queue;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Main logic class for maze game
 * Created by TJ on 2/27/2015.
 */
public class MazeGame implements GLSurfaceView.Renderer  {

    private Context context;

    private Queue<MotionEvent> touchQueue;

    public MazeGame(Context context) {
        this.context = context;
    }

    /**
     * Called when surface is created. Init method
     * @param na Legacy
     * @param config Config options
     */
    public void onSurfaceCreated(GL10 na, EGLConfig config) {
        //Initializes the touchQueue
        touchQueue = new LinkedList<MotionEvent>();
    }

    /**
     * Update Method
     * @param na Legacy
     */
    public void onDrawFrame(GL10 na) {
        //Respond to touch events

        //Update gamestate

        //Render
    }

    /**
     * Responds to touch events and adds them to the touchQueue to be processed next update
     * @param e A {@link MotionEvent} to add to the Queue
     * @return True for class that calls it
     */
    public boolean onTouchEvent(MotionEvent e) {
        touchQueue.add(e);
        return true;
    }

    /**
     * Not going to be used
     * @param na Legacy
     * @param width New width
     * @param height New height
     */
    public void onSurfaceChanged(GL10 na, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

}
