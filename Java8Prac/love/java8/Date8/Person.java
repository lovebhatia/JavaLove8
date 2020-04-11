package love.java8.Date8;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private LocalDate dateOfBirth;
	public Person(String name ,LocalDate dateOfBirth) {
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString()
	{
		return "Person ["+"name :" +name +"  Date of Birth : "+dateOfBirth+"]";
	}

}
