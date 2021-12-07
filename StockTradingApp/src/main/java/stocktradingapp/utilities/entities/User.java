package zomato.utilities.entities;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name="name")
	private String name ;
	@Column(name="phone")
	private int phone;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	public User() {
		super();
	}
	public User(String name, int phone, String email, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
