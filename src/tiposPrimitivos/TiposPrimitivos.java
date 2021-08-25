package tiposPrimitivos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java � fortemente tipada um valor atribuido a tipagem n�o pode ser modificado
		//Pode ser convertido um valor em um texto
		
		//Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true; 
		System.out.printf("%b %b \n", bo1, bo2);
		
		//Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		
		System.out.printf("%c %c %c \n", c1, c2, c3);
		
		//Tipo primitivo inteiros
		
		byte b = 127; //byte: � capaz de armazenar valores entre -128 at� 127.
		short s = 32767; //short: � capaz de armazenar valores entre � 32768 at� 32767.
		int i = 2147483647; //int: � capaz de armazenar valores entre �2147483648 at� 2147483647.
		long l = 9223372036854775807L;//long: � capaz de armazenar valores entre �9223372036854775808 at� 9223372036854775807
		System.out.printf("%d %d %d %d \n", b, s, i, l);
		
		//Tipos primitivos reais (ponto flutuante)
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("%.2f %1.f", f, d);
	}

}
