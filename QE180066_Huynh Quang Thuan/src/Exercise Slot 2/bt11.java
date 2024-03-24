/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class bt11 {
private String name;
    private char gender;
    public bt11() 
    {
		name = "Unknown";
		gender = 'u';
	}

	public bt11(String name) 
    {
		this.name = name;
		this.gender = 'u';
	}

	public bt11(char gender) 
    {
		this.name = "Unknown";
		this.gender = gender;
	}

	public bt11(String name, char gender) 
    {
		this.name = name;
		this.gender = gender;
	}

	public void display() 
    {
		System.out.println("Name: " + name);
		if (gender == 'u') 
        {
			System.out.println("Gender: Unknown");
		}
		if (gender == 'm') 
        {
			System.out.println("Gender: Male");
		}
		if (gender == 'f') 
        {
			System.out.println("Gender: Female");
		}
	}    
}
