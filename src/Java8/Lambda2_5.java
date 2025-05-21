package Java8;
interface A2{
	void show();
}
public class Lambda2_5 {

	public static void main(String[] args) {
		
		
		A2 obj;	
		
		//obj = () -> {System.out.println("Hello");};
		
		obj = () -> System.out.println("Hello");
		
		obj.show();
	}

}
