/* 1. Write method to check whether a string is a valid password. 
            * Password rules:
A password must have at least ten characters. A password consists of only letters and digits.
A password must contain at least two digits. 
*/

import java.util.Scanner;
public class PasswordChecker {

	public static void main(String[] args) {
		Scanner sn ;
		char ans;
		do {
			sn = new Scanner(System.in);
			System.out.println("Enter Password For Validation : ");
			String password = sn.nextLine();
			PassValidation(password);
			System.out.println("Do you want to Continue : (Y/N)");
			ans = sn.next().charAt(0);
		}while(ans == 'Y');
		sn.close();
	}
	static void PassValidation(String pass) {
		String spclchr = "(.*[@,#,$,%,^,!].*$)";
		char[] ch = pass.toCharArray();
		int cnt = 0;
		 if(pass.length() == 0) {
			 System.out.println("Blank password is not accepted.\n");
		 }
		 else if(pass.length()<10) {
			 System.out.println("Password should contain atleast 10 characters.\n");
		 }
		 else if(pass.matches(spclchr)) {
			 System.out.println("Password should not contain any Special Characters.\n");
		 }
		 else {
			for(int i =0; i < pass.length(); i++){
				if(Character.isDigit(ch[i]))
					cnt++;
			 }
			 if(cnt < 2)
				 System.out.println("Password is not Valid.It must contain atleast 2 digits.");
			 else 
				System.out.println("Password "+pass+" is Valid.\n");
		 }
		 
	}

}
