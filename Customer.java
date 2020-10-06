/*
 	Solution in Java
 */


package petStore;

public class Customer {
	private String name;
	private int age;
	private String favAnimal;
	private String favColor;
	private String favGender;
	
	public Customer()
	{
		name = "Null";
		age = 0;
		favAnimal = "Null";
		favColor = "Blank";
		favGender = "Null";
	}
	
	
	public Customer(String name, int age, String favAnimal, String favColor, String favGender) {
		this.name = name;
		this.age = age;
		this.favAnimal = favAnimal;
		this.favColor = favColor;
		this.favGender = favGender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavAnimal() {
		return favAnimal;
	}
	public void setFavAnimal(String favAnimal) {
		this.favAnimal = favAnimal;
	}
	public String getFavColor() {
		return favColor;
	}
	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}
	public String getFavGender() {
		return favGender;
	}
	public void setFavGender(String favGender) {
		this.favGender = favGender;
	}
	
	
	

}
