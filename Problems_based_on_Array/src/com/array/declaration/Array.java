package com.array.declaration;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[4];
		
		for(int i=0;i<=3;i++) {
			
			System.out.print("Enter arr["+i+"] = ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr)); 
		
		for(int n:arr) {
			System.out.println(n);
		}
	}

}
