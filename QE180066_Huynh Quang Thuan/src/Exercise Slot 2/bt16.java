/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class bt16 {
private int day;
	private int month;
	private int year;

	public bt16(int day, int month, int year) 
    {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDate(int day, int month, int year)
    {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() 
    {
		return day;
	}

	public void setDay(int day) 
    {
		this.day = day;
	}

	public int getMonth() 
    {
		return month;
	}

	public void setMonth(int month) 
    {
		this.month = month;
	}

	public int getYear() 
    {
		return year;
	}

	public void setYear(int year) 
    {
		this.year = year;
	}

	public void display()
    {
		String day = this.day + "";
		String month = this.month + "";
		String year = this.year + "";
		if (day.length() == 1)
         {
			day = "0" + day;			
		}
		if (month.length() == 1)
        {
			month = "0" + month;			
		}
		System.out.println(day + "/" + month + "/" + year);
	}   
}