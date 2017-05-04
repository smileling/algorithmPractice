package algorithm;

import java.util.Random;

public class QuickSort {
	
	public void quickSort(int[] arr, int low, int high) {
		if (low >= high) 
			return;
		
		int l = low;
		int h = high;
		int povit = arr[low];
		
		while(l<h) {
			while(l < h && arr[h] >= povit)
				h--;
			if(l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}
			while(l < h && arr[l] <= povit)
				l++;
			if(l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+",");
		System.out.println();
		System.out.println("l="+(l+1)+", h="+(h+1)+", povit="+povit );
		if(l>low) quickSort(arr,low,l-1);
		if(h<high) quickSort(arr,l+1,high);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		

		int[] arr = new int[10];
		for(int i =0 ; i< 10; i++){
			arr[i] = r.nextInt(20);
			System.out.print(arr[i]+",");
		}
		System.out.println();
		QuickSort qs = new QuickSort();
		qs.quickSort(arr,0,9);
		
		
		
	}

}
