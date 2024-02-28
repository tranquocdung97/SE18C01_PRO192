
public class Entry1 {

    public static void main(String[] args) {
        Person p = new Person(1001, "Quynh", 24, "Ha Noi");
        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
    }
}
