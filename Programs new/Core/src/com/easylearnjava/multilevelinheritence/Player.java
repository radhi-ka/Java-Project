package com.easylearnjava.multilevelinheritence;

//it cannot accept multiple inheritance becoz it confuses when retrieving 
//the method properties to choose which may be the immediate parent class
// public class Player extends CDPlayer, DVDPlayer{ }

public class Player extends CDPlayer{

public static void main(String[] args) {
	
	Player p= new Player();
	p.playSong();	
}
	
}
