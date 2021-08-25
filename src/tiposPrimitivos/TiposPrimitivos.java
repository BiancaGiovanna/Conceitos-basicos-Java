package tiposPrimitivos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java é fortemente tipada um valor atribuido a tipagem não pode ser modificado
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
		
		byte b = 127; //byte: é capaz de armazenar valores entre -128 até 127.
		short s = 32767; //short: é capaz de armazenar valores entre – 32768 até 32767.
		int i = 2147483647; //int: é capaz de armazenar valores entre –2147483648 até 2147483647.
		long l = 9223372036854775807L;//long: é capaz de armazenar valores entre –9223372036854775808 até 9223372036854775807
		System.out.printf("%d %d %d %d \n", b, s, i, l);
		
		//Tipos primitivos reais (ponto flutuante)
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("%.2f %1.f", f, d);
	}

}
