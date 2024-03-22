/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet.baithu;

/**
 *
 * @author FPTSHOP
 */
class Author{
    private String name;
    private String email;
    public Author(String name , String email){
        this.name = name ;
        this.email = email ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email ;
    }
}
class Book{
    private String name;
    private Author[] authors;
    private double price;
    public Book(String name, Author[] authors , double price){
        this.name = name;
        this.authors = authors ;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public Author[] getAuthors (){
        return authors ;
    }
    public void setAuthors(Author[] authors){
        this.authors = authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price =price ;
    }
    public String getAuthorNames(){
        String authorNames ="";
        for(int i=0;i< authors.length -1 ; i++){
            authorNames += authors[i].getName()+", ";
        }
        authorNames += authors[authors.length - 1].getName();
        return authorNames;
    }
}
public class bai34 {
    public static void main(String[] args) {
		Author[] authors = new Author[3];
		authors[0] = new Author("Viet", "VietCV@codelearn.io");
		authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
		authors[2] = new Author("Kien", "KienNT@Codelearn.io");
		
		Book book1 = new Book("C++ for Beginners", authors, 210000);
		System.out.println(book1.getAuthorNames());
	}
}
