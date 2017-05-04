package com.theironyard;

import com.badlogic.gdx.Game;
import com.theironyard.helpers.AssetLoader;
import com.theironyard.screens.GameScreen;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
