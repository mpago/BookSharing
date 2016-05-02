package de.bookexchange.pack;

public class User {
	
	private String fName;
	private String lName;
	private String email;
	private String street;
	private int houseNum;
	private String city;
	private String pwd;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String fName,String lName,String email,String street,int houseNum,String city,String pwd) {
		
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.street = street;
		this.houseNum = houseNum;
		this.city = city;
		this.pwd = pwd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
