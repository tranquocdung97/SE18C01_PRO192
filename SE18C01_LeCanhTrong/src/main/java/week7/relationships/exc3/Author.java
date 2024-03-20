/*
https://codelearn.io/learning/object-oriented-programming-in-java?activityType=12&activityId=1045
 */
package week7.relationships.exc3;

public class Author {
	private String name;
	private String email;

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
