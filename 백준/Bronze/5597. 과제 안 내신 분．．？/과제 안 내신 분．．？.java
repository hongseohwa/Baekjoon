import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean arr[] = new boolean[31];
		
		for(int i = 0; i < 28; i++) {
			arr[scanner.nextInt()] = true;
		}
		for(int i = 1; i <= 30; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}
}