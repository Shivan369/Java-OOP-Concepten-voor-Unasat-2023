package com.mavacore369.domain.com.collection_frameworks.arraylist.game;

import java.util.ArrayList;

/*
 * Shivan MavaCore369;
 *
 * */

public class GameMain {

	public static void main(String[] args) {
		ArrayList<GameModel> gameModelsList = new ArrayList<>();
		GameModel codGame = new GameModel("Call of Duty", "PS4");
		GameModel fifaGame = new GameModel("Fifa World Cup 2022", "PS4");
		GameModel bfieldGame = new GameModel("Battle Filed", "xBox");
		gameModelsList.add(codGame);
		gameModelsList.add(fifaGame);
		gameModelsList.add(bfieldGame);
		// Change codGame platform from ps4 to xbox 
		codGame.setGamePlatform("XBOX");
		for(int i = 0; i <gameModelsList.size();i++) {
			System.out.println(gameModelsList.get(i).gameName+ " in the format of " + gameModelsList.get(i).gamePlatform);
		}
		
	}

}
