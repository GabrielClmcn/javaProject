package com.ynov.clientServerBDDJSON.launcher;

import com.ynov.clientServerBDDJSON.fact.Personne;
import com.ynov.clientServerBDDJSON.fact.Personnes;

public class Launcher {

	public static void main(String[] args) {
		Personnes pers = new Personnes(false);
		
		for(Personne p : pers)
			System.out.println(p);
	}
}
