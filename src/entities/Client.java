package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birtdate;

	public Client() {
			
	}

	public Client(String name, String email, Date birtdate) {
		this.name = name;
		this.email = email;
		this.birtdate = birtdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirtdate() {
		return birtdate;
	}

	public void setBirtdate(Date birtdate) {
		this.birtdate = birtdate;
	}

	@Override
	public String toString() {
		return "name=" + name + ", email=" + email + ", birtdate=" + sdf.format(birtdate);
	}

	
	
	
	
	
}
