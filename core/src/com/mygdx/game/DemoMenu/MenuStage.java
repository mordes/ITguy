package com.mygdx.game.DemoMenu;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyBaseClasses.MyButton;
import com.mygdx.game.MyBaseClasses.MyStage;
import com.mygdx.game.MyBaseClasses.OneSpriteAnimatedActor;
import com.mygdx.game.MyBaseClasses.ShapeType;
import com.mygdx.game.MyGdxGame;

/**
 * Created by tuskeb on 2016. 09. 30..
 */
public class MenuStage extends MyStage {
    private TextButton playButton, settingsButton, exitButton;
    private Table table;


    public MenuStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
    }


    public void init()
    {
        addBackEventStackListener();
        playButton = new MyButton("Play",game.getSkin());
        settingsButton = new MyButton("Settings",game.getSkin());
        exitButton = new MyButton("Exit",game.getSkin());
        table = new Table();
        table.setFillParent(true);
        table.center().add(playButton).size(200,200);
        table.row();
        table.add(settingsButton).size(200,200);
        table.row();
        table.add(exitButton).size(200,200);
        this.addActor(table);

    }


    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void dispose() {
        super.dispose();

    }
}