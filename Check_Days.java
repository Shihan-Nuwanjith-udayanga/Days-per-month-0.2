import java.util.*;
class Check_Days{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Month Number : ");
		int month=input.nextInt();
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("31 Days");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("30 Days");
			break;
			case 2:
			System.out.println("28 Days");
			break;
			default:
			System.out.println("Wrong Month");
		}
	}
}
