package Programming1;

public class Denemeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char nul = '\0'; 
		System.out.println(nul + "djkh'\0'skd");
		
		String[] str = {"Hello", "world", "!"};
		
		str[2] = '\0' + "";
		
		System.out.println(str[2]);
		
		String st = "30234";
		int num = 393;
		
		System.out.println(String.valueOf(num));
		System.out.println(Integer.parseInt(st));
		
		int octal = 02743;				// 0 ile baslayinca octal kabul ediyor
		int binary = 0B010101;			// 0b || 0B ile baslayinca binary kabul ediyor; 
		int hexadecimal = 0x3292F3a;	// 0x || 0X ile baslayinca hexadecimal kabul ediyor
		
//		for(;;);	// endless loop imis detayli bak
		
		int x = 0b010010; // 2+16
		int y = ~x;	// 2's complement ile degil direk sayilari tam tersine cevirerek veriyor.
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(y+ 0b1);
		
		
	}

}
