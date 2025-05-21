package Java8;

interface A3{
	void show(int i);
}

public class Lambda3_6 {

	public static void main(String[] args) {
		
		A3 obj;
		obj = (int i) -> System.out.println("Hello " + i);
		//obj = i -> System.out.println("Hello " + i);
		obj.show(6);

	}

}
