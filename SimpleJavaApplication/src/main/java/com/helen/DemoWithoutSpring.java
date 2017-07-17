package com.helen;

import com.helen.entities.BaseballGame;
import com.helen.entities.Cubs;
import com.helen.entities.Game;
import com.helen.entities.RedSox;
import com.helen.entities.Team;

public class DemoWithoutSpring {
	public static void main(String[] args) {
		Team redSox = new RedSox();
		Team cubs = new Cubs();
		Game game = new BaseballGame(redSox, cubs);
		System.out.println(game.playGame());
	}
}
