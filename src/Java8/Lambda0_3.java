package Java8;

interface A{

	void show();
}

class xyz implements A{
	public void show() {
		System.out.println("Hello");
	}
}

public class Lambda0_3 {

	public static void main(String[] args) {
	
		A obj;// we can create reference of A 
		obj = new xyz();// but cannot create object without impl of A in xyz class
		obj.show(); // Hello
	}

}
