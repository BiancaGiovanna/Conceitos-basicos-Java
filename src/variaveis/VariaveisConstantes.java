package variaveis;

public class VariaveisConstantes {

	public static void main(String[] args) {
		double raio = 4.5;
		//final é uma constante
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("área é " + area + " m²");
		
		//printf formata o print
		//%f recebe o valor de uma variavel
		System.out.printf("Área é %f m² \n", area);
		
		System.out.printf("Área é %.2f m²", area);
	}

}
