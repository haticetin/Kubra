package Programming1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {


		String email = "test@mail.example.com";
		
		EmailAdress ea = new EmailAdress(email);
		
		System.out.println(ea.toString());
		System.out.println(ea.getLocalPart());
		System.out.println(ea.getDomainPart());
		System.out.println(Arrays.toString(ea.getDomainParts()));
	}

}
