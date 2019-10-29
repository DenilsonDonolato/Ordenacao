import java.util.Arrays;

public class DadosString
{
	private String[] array;
	private long tempo;
	
	DadosString(String[] array, boolean piorCaso)
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
	
	DadosString(String[] array)
	{
		this.array = array;
	}
	
	
	private void preenchePiorCaso()
	{
		for(int i = 0; i < array.length; i++) {
			array[i] = String.valueOf(array.length - i);
		}
	}
	
	public String[] getArray()
	{
		return array;
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
