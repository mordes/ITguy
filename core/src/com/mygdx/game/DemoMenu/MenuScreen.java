package com.mygdx.game.DemoMenu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.MyScreen;
import com.mygdx.game.MyBaseClasses.MyStage;
import com.mygdx.game.MyBaseClasses.OneSpriteStaticActor;
import com.mygdx.game.MyGdxGame;

/**
 * Created by tuskeb on 2016. 09. 30..
 */
public class MenuScreen extends MyScreen {

    protected MenuStage menuStage;
    private MyStage bgStage;

    public MenuScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        super.render(delta);


        menuStage.act(delta);
        menuStage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

    }

    @Override
    public void dispose() {
        menuStage.dispose();
        super.dispose();
    }

    @Override
    public void init() {
        menuStage  = new MenuStage(new ExtendViewport(1280,720,new OrthographicCamera(1280,720)), spriteBatch, game);
        Gdx.input.setInputProcessor(menuStage);
        setBackGroundColor(1f, 1f, 1f);

    }
}
