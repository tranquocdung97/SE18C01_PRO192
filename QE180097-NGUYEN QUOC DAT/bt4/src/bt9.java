class Studentss{
    String name;
    int age;

public Studentss(){

}

public void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
}
}
public class bt9 {
	public static void main(String[] args) {
		Studentss[] students = new Studentss[3];
        for(int i = 0; i<3; i++ ){
            students[i] = new Studentss();
        }
		students[0].name = "Tuan";
        students[0].age = 24;
		students[1].name = "Cuong";
        students[1].age = 25;
        students[2].name = "Duc";
        students[2].age = 24;
		
		for (int i = 0; i < 3; i++) {
			students[i].display();
		}
	}
}
