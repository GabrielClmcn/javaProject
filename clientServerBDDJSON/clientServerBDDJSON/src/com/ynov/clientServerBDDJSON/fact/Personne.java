package com.ynov.clientServerBDDJSON.fact;

public class Personne {
	private int m_Id;
	private String m_Name;
	private String m_LastName;
	private int m_Gender;
	private int m_Year;

	public Personne(int id, String name, String lastName, int gender, int year) {
		m_Id = id;
		m_Name = name;
		m_LastName = lastName;
		m_Gender = gender;
		m_Year = year;
	}

	public String toString() {
		return String.format("%3d : %-4s %20s %20s ne(e) en %d",
				m_Id,(m_Gender==1?"Mme.":"M."),
				m_Name, m_LastName, m_Year);
	}

	public int getId() {
		return m_Id;
	}

	public String getName() {
		return m_Name;
	}

	public String getLastName() {
		return m_LastName;
	}

	public int getGender() {
		return m_Gender;
	}

	public int getYear() {
		return m_Year;
	}
}
