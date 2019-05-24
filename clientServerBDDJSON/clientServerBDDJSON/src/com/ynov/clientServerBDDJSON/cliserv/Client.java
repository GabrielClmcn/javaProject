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
			System.out.println("Entrer la commande : ");
			String messageEcrit = sc.nextLine();
			JSONObject jso = new JSONObject();
			jso.put("commande", messageEcrit);
			if(!messageEcrit.equals("*")) {
				System.out.println("Il me faut une année : ");
				int annee=sc.nextInt();
				jso.put("annee", annee);
			}
			out.println(jso);
			// récupérer la réponse de type jsonarray

		}catch(Exception e) {
			System.out.println("Problème client : "+e);
		}
	}

//	private String sendMessage(String message) {
//		try {
//			out.println(message);
//			return in.readLine();
//		} catch (Exception e) {
//			return "An error occured!";
//		}
//	}

	public static void main (String args[]) {
		new Client("localhost", 1234);
	}
}