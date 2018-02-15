package com.mygdx.game.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.MyBaseClasses.MyScreen;
import com.mygdx.game.MyGdxGame;

/**
 * Created by Hegedüs Csongor on 2/14/2018.
 */

public class GameScreen extends MyScreen{

    protected GameStage gameStage;

    public GameScreen(MyGdxGame game, ReadParameter readParameter) {
        super(game);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        gameStage.act(delta);
        gameStage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void dispose() {
        //gameStage.dispose();
        super.dispose();
    }

    @Override
    public void init() {
        gameStage = new GameStage(new ExtendViewport(1280, 720, new OrthographicCamera(1280,720)),spriteBatch,game);
        Gdx.input.setInputProcessor(gameStage);
        setBackGroundColor(1f, 1f, 1f);
    }
}