package org.Array40Progms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ArrayAverageGreaterThen 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter size of the array: ");
		String str1 = br.readLine();
		int n = Integer.parseInt(str1);
		int numbers[] = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) 
		{
			String str2 = br.readLine();
			numbers[i] = Integer.parseInt(str2);
		}
		System.out.println("Created Array is:"+Arrays.toString(numbers));
		double avg = average(numbers);
		System.out.println("Average = " + avg);
		display(numbers, avg);
		System.out.println("Numbers greater then average = ");
	}
	public static void display(int[] numbers, double avg) 
	{
		for (int i : numbers) {
			if (i > avg)
				System.out.print(i + " ");
		}
	}
	public static double average(int[] numbers) 
	{
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) 
		{
			sum += numbers[i]; 
		}
		return sum / numbers.length;
	}
}
