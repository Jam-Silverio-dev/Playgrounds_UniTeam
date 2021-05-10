package com.accenture.bootcamp.day7.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
	private String name, weapon;
	private int hitPoints, strength;
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public List<String> write() {
		List<String> name = new ArrayList<String>();
		
		return null;
	}

	public void read(List<String> name) {
		if (this.name != null && this.hitPoints > 0 && this.strength > 0 && this.weapon != null) {
			// TODO
		}
		
	}

	@Override
	public String toString() {
		return "Player{name=" + this.getName() +
		", hitpoints=" + this.getHitPoints() + 
		", strength=" + this.getStrength() + 
		", weapon=" + this.getWeapon();
	}
	
	
	
	
	
}
