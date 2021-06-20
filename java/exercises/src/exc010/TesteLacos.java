package exc010;

public class TesteLacos {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println("A tabuada de "+ i +" é:");
			for(int j=0; j<=10; j++) {
				System.out.print(i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}