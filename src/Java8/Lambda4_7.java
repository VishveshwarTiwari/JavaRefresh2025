package Java8;

interface A4{
	void show(int i,int j);
}

public class Lambda4_7 {

	public static void main(String[] args) {

		A4 obj;
		
		
		//obj = (int i,int j) -> System.out.println("Hello " + (i+j));
		
		//obj = (i,j) -> System.out.println("Hello " + (i+j));
		//obj = i,j -> System.out.println("Hello " + (i+j)); // not possible to write this way
		obj = (i,j) -> System.out.println( (i+j));
		
		obj.show(6,7);

	}

}
