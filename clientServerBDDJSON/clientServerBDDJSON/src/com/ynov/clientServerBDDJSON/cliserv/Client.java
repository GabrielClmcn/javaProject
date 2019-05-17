package com.ynov.clientServerBDDJSON.cliserv;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;


public class Client{

	private BufferedReader in;
	private PrintWriter out;

	public Client(String ipServeur, int port) {
		try {
			Socket skt = new Socket(ipServeur, port);
			in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			out = new PrintWriter(skt.getOutputStream(),true);
			Scanner sc = new Scanner(System.in);

			String messageEcrit = sendMessage(sc.nextLine());
			// Lire la commande au clavier -> comm
			if(messageEcrit.equals("comm")) {
				// créer le json et placer la clé commande
				JSONObject jso = new JSONObject();
				// si comm !="*"
				if (messageEcrit != "*") {
					// lire l'année et placer la clé valeur dans le json
					// envoyer le json au serveur
				}
				else if(messageEcrit.equals("help")) {
					System.out.println("Type comm");
				}
				else {
					// lire la réponse
					System.out.println();
				}
			}
		}catch(Exception e) {
			System.out.println("Problème client : "+e);
		}
	}

	private String sendMessage(String message) {
		try {
			out.println(message);
			return in.readLine();
		} catch (Exception e) {
			return "An error occured!";
		}
	}

	public static void main (String args[]) {
		new Client("localhost", 1234);
	}
}