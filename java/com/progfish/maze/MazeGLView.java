package com.progfish.maze;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Intermediate Class between activity and renderer/main loop
 * Created by TJ on 2/27/2015.
 */
public class MazeGLView extends GLSurfaceView {

    private final MazeGame mazeGame;

    /**
     * Creates a GLView to make a renderer in
     * @param context Used to access a lot of thing
     */
    public MazeGLView(Context context) {
        super(context);

        // Create OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mazeGame = new MazeGame(context);

        setRenderer(mazeGame);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return mazeGame.onTouchEvent(e);
    }

}
