public class bt16 {
	private int id;
	private String name;
	private int age;
	private String address;
	private int score;

	public bt16() {

	}

	public bt16(int id, String name, int age, String address, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.setScore(score);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0) {
			this.score = 0;
		} else if (score > 10) {
			this.score = 10;
		} else {
			this.score = score;
		}
	}
}
 class entrys {
    	public static void main(String[] args) {
		bt16 s = new bt16(1001, "Trung", 24, "Ha Noi", 5);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println(s.getScore());
		s.setScore(-7);
		System.out.println(s.getScore());
		s.setScore(15);
		System.out.println(s.getScore());
	}
}
