import java.util.Arrays;

public class DadosDouble
{
	private double[] array;
	private long tempo;
	
	DadosDouble(double[] array, boolean piorCaso)
	{
		this(array);
		if(piorCaso) {
			preenchePiorCaso();
		} else {
			if(this.array.length == 0) {
				throw new RuntimeException("Array inválido!");
			}
		}
	}
	
	DadosDouble(double[] array)
	{
		this.array = array;
	}
	
	private void preenchePiorCaso()
	{
		for(int i = 0; i < array.length; i++) {
			array[i] = (double) array.length - i;
		}
	}
	
	public void sort()
	{
		long ti,tf;
		ti = System.nanoTime();
		Arrays.sort(array);
		tf = System.nanoTime();
		tempo = tf - ti;
	}
	
	public long getTempo()
	{
		return tempo;
	}
}
