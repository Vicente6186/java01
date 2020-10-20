import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int bin = 0b00001000;
		
		if((d & bin) != 0)
		{
			System.out.println("This number is true!");
		}
		else
		{
			System.out.println("False!");
		}
	}

}
