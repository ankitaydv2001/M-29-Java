package org.tnsif.arrays;

import java.util.Scanner;

public class JaggedArrayExample {
	
	public static void main(String[]args) {
		//in jagged array inside array size is different
		int arr[][]=new int[2][];
		
		Scanner s = new Scanner(System.in);
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]= s.nextInt();
			}
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					System.out.println(arr[i][j]+" ");
				}
			System.out.println();
		}
	}

	}
}
