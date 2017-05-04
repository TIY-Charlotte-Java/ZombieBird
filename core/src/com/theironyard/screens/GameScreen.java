package com.theironyard.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.theironyard.gameworld.GameRenderer;
import com.theironyard.gameworld.GameWorld;
import com.theironyard.helpers.InputHandler;

/**
 * Created by Ben on 5/3/17.
 */
public class GameScreen implements Screen {
    private GameWorld world;
    private GameRenderer renderer;

    private float runTime = 0;


    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY); // initialize world
        renderer = new GameRenderer(world, (int)gameHeight, midPointY); // initialize renderer

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
