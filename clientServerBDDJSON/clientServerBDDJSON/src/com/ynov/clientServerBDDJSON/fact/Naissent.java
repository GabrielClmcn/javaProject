package com.ynov.clientServerBDDJSON.fact;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.ynov.clientServerBDDJSON.connector.MySqlConnector;

@SuppressWarnings("serial")
public class Naissent extends ArrayList<Personne>{

	public Naissent() {

		try {
			MySqlConnector mc = new MySqlConnector("javaProject");

			String sql="SELECT * FROM joue";
			ResultSet rs=mc.select(sql);

			while(rs.next()) {
				
			}				
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}		
	}
}
