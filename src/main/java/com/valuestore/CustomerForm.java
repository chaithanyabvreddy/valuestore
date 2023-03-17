package com.valuestore;

public class CustomerForm {
	private Long id;

	private String firstName;
	private String lastName;
	private int age;
	private String emailId;
	private String phoneNumer;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", emailId=" + emailId + ", phoneNumer=" + phoneNumer + ", address=" + address + ", getId()="
				+ getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()="
				+ getAge() + ", getEmailId()=" + getEmailId() + ", getPhoneNumer()=" + getPhoneNumer()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
