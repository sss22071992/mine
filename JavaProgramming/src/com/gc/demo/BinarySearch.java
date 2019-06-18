package com.gc.demo;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int binarySearch(int arr[], int size, int item)
		{
			int left,right,middle;
			left=0;
			right = size-1;
			while(left<=right)
			{
				middle=((left+right)/2);
				if (item==arr[middle])
					
				{
					return middle;
				}
			}
			
		}
	}
}
