package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacGame(); // 1. Object Creation
		
		var gameRunner = new GameRunner(game);
		//2. Object creation + wiring of dependencies
		// Game is a Dependency of GameRunner
		
		gameRunner.run();

	}

}
