/*
 	Solution in Java
 */


package petStore;

public class Pet {
	private String animalName;
	private int age;
	private String color;
	private String gender;
	
	public Pet()
	{
		animalName = "Null";
		age = 0;
		color = "Blank";
		gender = "Null";
	}
	
	public Pet(String newName, int newAge, String newColor, String newGender)
	{
		this.animalName = newName;
		this.age = newAge;
		this.color = newColor;
		this.gender = newGender;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
