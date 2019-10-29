import java.util.Scanner;

public class ExercicioString
{
	final static int NUM_TESTE = 10;

	public static void main(String[] args)
	{
		System.out.println("Usando String.");
		int tamanho,loop=0;
		String[] array;
		long[] tempo;
		while(true) {
			tamanho = escolheTamanho(loop);
			if(tamanho == 0) {
				break;
			}
			array = new String[tamanho];
			tempo = new long[NUM_TESTE];
			for(int i = 0; i < NUM_TESTE; i++) {
//				System.out.println("Fazendo o teste de número " + (i + 1) + " ...");
				DadosString dadosString = new DadosString(array, true);
				dadosString.sort();
				tempo[i] = dadosString.getTempo();
			}
			double tempoMedio = calculaTempoMedio(tempo)/1000/1000;
			System.out.println("O tempo médio para organizar o array no pior caso é: " + tempoMedio + " ms");
			loop++;
		}
	}
	
	private static double calculaTempoMedio(long[] tempo)
	{
		double aux=0;
		for(int i = 0; i < tempo.length; i++) {
			aux += tempo[i];
		}
		return aux / tempo.length;
	}
	
	static int escolheTamanho(int loop)
	{
		int tamanho;
		switch(loop) {
			case 0:
				System.out.println("Sort no array de 1.000 posições.");
				tamanho = 1000;
				break;
			case 1:
				System.out.println("Sort no array de 5.000 posições.");
				tamanho = 5000;
				break;
			case 2:
				System.out.println("Sort no array de 10.000 posições.");
				tamanho = 10000;
				break;
			case 3:
				System.out.println("Sort no array de 50.000 posições.");
				tamanho = 50000;
				break;
			case 4:
				System.out.println("Sort no array de 100.000 posições.");
				tamanho = 100000;
				break;
			case 5:
				System.out.println("Sort no array de 500.000 posições.");
				tamanho = 500000;
				break;
			case 6:
				System.out.println("Sort no array de 1.000.000 posições.");
				tamanho = 1000000;
				break;
			case 7:
				System.out.println("Sort no array de 5.000.000 posições.");
				tamanho = 5000000;
				break;
			case 8:
				System.out.println("Sort no array de 10.000.000 posições.");
				tamanho = 10000000;
				break;
			case 9:
				System.out.println("Sort no array de 50.000.000 posições.");
				tamanho = 50000000;
				break;
			default:
				System.out.println("Finalizando o programa.");
				tamanho = 0;
				break;
		}
		return tamanho;
	}
	
	static int escolheNumeroTestes()
	{
		Scanner scanner = new Scanner(System.in);
		int numTeste;
		do {
			System.out.println("Para merolhar a precisão do teste você pode repetir o teste algumas vezes.");
			System.out.println("Escolha quantas vezes o teste será repetido (1 a 10):");
			numTeste = scanner.nextInt();
		} while(numTeste < 1 || numTeste > 10);
		return numTeste;
	}
}
