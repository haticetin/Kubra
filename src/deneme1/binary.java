package deneme1;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 0; i<32; i++) {
			sum += Math.pow(2, i);
		}
		
		System.out.println(sum);
		System.out.println(Math.pow(2, 32));
		
		int n = 0767;
		n = 0xabc326f;
		n = 0b01110001;
		
		System.out.println(n);

	}

}
