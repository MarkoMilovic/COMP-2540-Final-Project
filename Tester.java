import java.util.*;


public class Tester {

	public static void main(String[] args) {
		
		Week plan= new Week();
		int choice;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("Enter the day you wish to edit\n1) Sunday\n2) Monday\n3) Tuesday");
			System.out.print("\n4) Wednesday\n 5)Thursday\n6) Friday\n 7) Saturday \n8)Display Entire week");
			choice=sc.nextInt();
			switch (choice) {
			
			case 1 : //plan.Week[0]
					break;
			case 2 ://plan.Week[1]
					break ;
			case 3 :// plan.Week[2]
					break;
			case 4 : //plan.Week[3]
				break;
			case 5 ://plan.Week[4]
				break ;
			case 6 :// plan.Week[5]
				break;
			case 7 :// plan.Week[6]
					break;
			case 8: //plan.display
					break;
			default : 
					System.out.println("Invalid Selection");
						break;
			}
			

			
			}
			
			
			
		
	}
}
