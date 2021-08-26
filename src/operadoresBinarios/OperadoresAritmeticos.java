package operadoresBinarios;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer num1 = 3;
		Integer num2 = 4;
		Integer num3 = 5;

		// Operadores: + - * / %
		Integer soma = num1 + num2 + num3 + 6;

		System.out.println(soma);
		System.out.println(num1 - num2 - num3);

		// Cuidado com a precedência
		System.out.println(num1 + num3 * num2 / 2);
		System.out.println((num1 + num3) * num2 / 2);

		// Resto da divisão
		System.out.println(10 % 2);
	}

}
