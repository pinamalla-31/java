package com.java.arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int x[]= {30,50,20,40,10};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int z:x)
		{
			System.out.println(z);
		}
	}

}
