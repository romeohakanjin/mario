package com.romeo.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.romeo.game.Mario;
import com.romeo.game.Scenes.Hud;

/**
 * Created by rhakanjin on 25/01/2017.
 */

public class PlayScreen implements Screen {
    private Mario game;
    private OrthographicCamera gamecam;
    private Viewport gameport;
    private Hud hud;

    public PlayScreen(Mario game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gameport = new FitViewport(Mario.V_WIDTH, Mario.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gameport.update(width, height);
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
