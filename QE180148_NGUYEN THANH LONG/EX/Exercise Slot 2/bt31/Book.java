/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt31;

/**
 *
 * @author Admin
 */
public class Book
{
    private String name;
    private Author[] authors;
    private double price;
    public Book (String name, Author[] authors, double price)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
    } 
    public void setName (String name)
    {
        this.name=name;
    }
    public String getName ()
    {
        return name;
    }
    public void setPrice (double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public String getAuthorNames()
    {
        String authorNames = "";
		for (int i = 0; i < authors.length - 1; i++) 
        {
			authorNames += authors[i].getName() + ", ";
		}
		authorNames += authors[authors.length - 1].getName();
		return authorNames;
    }
}
