package org.ArraysusingMethods;

public class MissingElements 
{
    public static void main(String[] args)
    {
        int[] input = {1,3,4,5};
        int range = 5;
        System.out.println("Missing Elements:");
        MissingElements.findMissingElements(input, range);
    }
    static int[] findMissingElements(int[] input, int range) 
    {
        int[] copy = new int[range + 1];
        for (int iter : input) 
        {
            copy[iter] = 1;
        }
        for (int i = 1; i <= range; i++) 
        {
            if (copy[i] == 0)
                System.out.println(i);
        }
		return copy;
    }
}

