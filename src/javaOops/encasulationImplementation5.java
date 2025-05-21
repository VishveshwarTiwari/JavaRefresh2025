package javaOops;

public class encasulationImplementation5 {

	public static void main(String[] args) {
		
		laptop l1 = new laptop();
		l1.ram = 30;
		l1.setRam(40);
		l1.setPrice(1000000);
		
		System.out.println("Ram of Laptop = " + l1.ram + "\n"+ "price of Laptop =  " + l1.getPrice()  );
		
		
	}

}

class laptop{
	int ram;
	private int price;
	
		 public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			//is user an admin
			
			boolean isAdmin = true;
			if(isAdmin == false ) {
				System.out.println("cannot set the price");
			}else
			System.out.println("can set the price");
			this.price = price;
		}
	}
	

