package conversaoNumerica;

public class ConversaoNumerica {

	public static void main(String[] args) {
		//Conversão explícita
		float f = (float) 0.1;
		System.out.println(f);

		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//Conversão implícita
		
		int i2 = 'a';
		System.out.println(i2);
		
		double d = 1001;
		System.out.println(d);
	}

}
