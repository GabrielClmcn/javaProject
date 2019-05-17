package com.ynov.clientServerBDDJSON.cliserv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ynov.clientServerBDDJSON.fact.Personnes;

public class Serveur {
	public Serveur() {
		try {
			ServerSocket srvr = new ServerSocket(1234);
			System.out.println("Serveur à l'écoute...");
			Personnes personnes = new Personnes(false);
			while(true) {
				Socket sock = srvr.accept();
				System.out.println("Un client est connecté !");

				PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
				BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

				// lire la requête du client -> String
				String input = in.readLine();
				// transformer la requête en jsonobject
				JSONObject jso = new JSONObject(input);
				// transférer cette requête à l'objet Personnes					
				// récupérer le résultat et l'envoyer au client
				JSONArray reponse=personnes.traiteDemande(jso);
				out.println(reponse);
				//fermeture
				out.close();
				sock.close();
			}
		}
		catch(Exception e) {
			System.out.println("Const. Serveur1 -> Problème : "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		new Serveur();
	}

}
