import java.util.*;
public class pass5 {
	public static void main(String args[]){
		String pass = new String("invu");
		String guess =  "";
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 4; i++){
			System.out.print("password: ");
			guess = sc.nextLine();
			if(pass.equals(guess)){
				System.out.println("login correct");
			}else{
				System.out.println("login incorrect");
			}
		}
	}
}
