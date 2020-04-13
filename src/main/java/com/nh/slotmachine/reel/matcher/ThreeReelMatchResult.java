package com.nh.slotmachine.reel.matcher;

import lombok.Data;

@Data
public class ThreeReelMatchResult {

	private final boolean isWinner;
	private final String description;

	private final int winCents;

	public ThreeReelMatchResult(boolean isWinner, String description, int winCents) {
		this.isWinner = isWinner;
		this.description = description;
		this.winCents = winCents;
	}

}
