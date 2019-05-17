package com.ynov.clientServerBDDJSON.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnector {
	private Connection con;
	String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public MySqlConnector(String IP, String base, String login, String pass) {
		try {
			String url = "jdbc:mysql://"+ IP +"/" + base + timeZone;
			con=DriverManager.getConnection(url, login, pass);
		} catch(Exception exc) {
			System.err.println(exc.getMessage());
		}
	}

	public MySqlConnector(String base) {
		//add your login and pass
		this("localhost", base, "", "");
	}

	public ResultSet select (String sql) {
		try {
			Statement instruction=con.createStatement();
			ResultSet rs=instruction.executeQuery(sql);
			return rs;
		} catch(Exception exc) {
			System.err.println(exc.getMessage());
			return null;
		}
	}
}
