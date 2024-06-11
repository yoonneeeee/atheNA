package basic;

public class PersonTest {
	public static void main(String[] args) {
		Person per = new Person();
		per.age = 40;
		per.name = "제임스";
		per.isMarried = true;
		per.numberOfChildren = 2;
		
		System.out.println(per.age);
		System.out.println(per.name);
		System.out.println(per.isMarried);
		System.out.println(per.numberOfChildren);
	}
}
