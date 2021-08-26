package operadoresBinarios;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean executouTrabalho1 = false;
		Boolean executouTrabalho2 = true;

		Boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		
		Boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		Boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("Tv 50 = " + comprouTv50);
		System.out.println("Tv 32 = " + comprouTv32);
		
		// Operador unário intruso
		System.out.println("Fome = " + !comprouSorvete);
	}

}
