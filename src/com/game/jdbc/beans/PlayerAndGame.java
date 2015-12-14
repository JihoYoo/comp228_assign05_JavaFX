package com.game.jdbc.beans;

import java.sql.Date;

public class PlayerAndGame {

	// PRIVATE INSTANCE VARIABLES
	private int player_game_id;
	private int game_id;
	private int player_id;
	private Date _date;
	private int _score;
	
	// PUBLIC PROPERTIES GETTERS
	public int getId() {
		return this.player_game_id;
	}
	public int getGameId() {
		return this.game_id;
	}
	public int getPlayerId() {
		return this.player_id;
	}
	public Date getDate() {
		return this._date;
	}
	public int getScore() {
		return this._score;
	}
	
	// PUBLIC PROPERTIES SETTERS
	public void setId(int player_game_id) {
		this.player_game_id = player_game_id;
	}
	public void setGameId(int game_id) {
		this.game_id = game_id;
	}
	public void setPlayerId(int player_id) {
		this.player_id = player_id;
	}
	public void setDate(Date playing_date) {
		this._date = playing_date;
	}
	public void setScore(int score) {
		this._score = score;
	}
	
}
