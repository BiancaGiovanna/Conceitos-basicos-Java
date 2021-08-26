package variaveis;

public class VariaveisConstantes {

	public static void main(String[] args) {
		double raio = 4.5;
		//final é uma constante
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("�rea � " + area + " m�");
		
		//printf formata o print
		//%f recebe o valor de uma variavel
		System.out.printf("�rea � %f m� \n", area);
		
		System.out.printf("�rea � %.2f m�", area);
	}

}
