import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a , b = 0;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}