/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt31;

/**
 *
 * @author Admin
 */
public class Author
{
    private String name;
    private String email;
    public Author ( String name, String email)
    {
        this.name=name;
        this.email=email;
    }
    public void setName ( String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail( String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
}