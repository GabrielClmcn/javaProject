package com.ynov.clientServerBDDJSON.fact;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ynov.clientServerBDDJSON.connector.MySqlConnector;


@SuppressWarnings("serial")
public class Personnes extends ArrayList<Personne> {

	public Personnes (boolean empty) {
		if(!empty) {
			try {
				MySqlConnector mc = new MySqlConnector("javaProject");

				String sql="SELECT * FROM anniversaire";
				ResultSet rs=mc.select(sql);
				while(rs.next()) {
					int id = rs.getInt("Id");
					String n=rs.getString("Name");
					String lastN=rs.getString("LastName");
					int y=rs.getInt("Year");
					int g=rs.getInt("Gender");
					this.add(new Personne(id, n, lastN, g, y));
				}
			} catch (Exception exc) {
				System.out.println(exc.getMessage());
			}
		}
	}
	
	public JSONArray traiteDemande(JSONObject demande) {
		String commande=demande.getString("commande");
		JSONArray res=new JSONArray();
		if(commande.equals("*")) {
			for(Personne p:this) {
				res.put(p.toJson());
			}
		}
		else if(commande.equals("<=")) {
			int annee=demande.getInt("valeur");
				for(Personne p:this) {
					if(p.getYear()<=annee)
						res.put(p.toJson());
				}
		}
		else if(commande.equals("==")) {
			int annee=demande.getInt("valeur");
				for(Personne p:this) {
					if(p.getYear()==annee)
						res.put(p.toJson());
				}
		}
		else if(commande.equals("!=")) {
			int annee=demande.getInt("valeur");
				for(Personne p:this) {
					if(p.getYear()!=annee)
						res.put(p.toJson());
				}
		}
		else {
			int annee=demande.getInt("valeur");
			if(commande.equals(">="))
				for(Personne p:this) {
					if(p.getYear()>=annee)
						res.put(p.toJson());
				}
		}
		return res;
	}
}