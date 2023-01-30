import java.util.*;
public class pass1{
	public static void main(String args[]){
		String password = "s";
		Scanner sc = new Scanner(System.in);
		while(true){
			//System.out.println("");
			System.out.print("password:");
			String input = sc.nextLine();
			if(password.equals(input)){
				System.out.println("login correct");
				break;
			}
			System.out.println("login incorrect");
		}
	}
}







