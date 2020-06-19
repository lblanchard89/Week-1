
public class Loops {

	public static void main(String[] args) {
		
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		
		int y = 100;
		while (y >= 0) {
			System.out.println(y);
			y -= 3;
		}
		
		for (int z = 1; z <= 1003; z +=2) {
			System.out.println(z);
		}
		
	
		for (int i = 0; i <= 100; i++) {
			String toPrint = "";
			
			if (i % 3  == 0) {
				toPrint += "Hello";
			}
			if (i % 5 == 0) {
				toPrint += "World";
			}
			if((i % 3 != 0) && (i % 5 != 0))  {
				toPrint += i;
			}
			System.out.println(toPrint); 
			
		}
	}
}
