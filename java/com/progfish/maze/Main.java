package com.progfish.maze;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * MAIN Class for Maze Game
 * Created by TJ on 2/27/2015.
 */
public class Main extends Activity {

    /**
     * All processing done within
     */
    private GLSurfaceView mazeView;

    /**
     * Called when app starts
     * @param bundle "savedInstanceState?"
     */
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mazeView = new MazeGLView(this);
        this.setContentView(mazeView);
    }

}
