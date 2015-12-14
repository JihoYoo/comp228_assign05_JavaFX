package com.game.jdbc.beans;

public class Game 
{
	// PRIVATE INSTANCE VARIABLES
	private int game_id;
	private String game_title;
	
	// PUBLIC PROPERTIES GETTERS
	public int getId() {
		return this.game_id;
	}
	public String getTitle() {
		return this.game_title;
	}
		
	// PUBLIC PROPERTIES SETTERS
	public void setId(int game_id) {
		this.game_id = game_id;
	}
	public void setTitle(String game_title) {
		this.game_title = game_title;
	}
	
}
