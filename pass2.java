import java.util.*;
public class pass2{
	public static void main(String args[]){
		String pwd = "sd";
		Scanner sc = new Scanner(System.in);
		System.out.print("password:");
		String gss = sc.nextLine();
		if(pwd.equals(gss)){
			System.out.println("Login Correct");
		}else{
			System.out.println("Login Incorrect");
		}
	}
}
