package com.tluzar.library;

public class User {
	
	private String name;
    private String address;
    private String phone;
    private String username;
    private String password;
    
	public User(String name, String address, String phone, String username, String password) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.username = username;
	this.password = password;
}
      
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDetail(){
        return "Name: " + name + " |" +
                "Address: " + address + " |" +
                "Phone: " + phone;
    }
	

}
