package test;

import java.util.*;

import org.omg.CORBA.MARSHAL;

import java.io.*;


//선택 정렬
public class Main6_1 {

	public static void main(String[] args) {

		Main6_1 T = new Main6_1();

		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		for(int x:T.solution(n ,arr)) System.out.println(x+" ");
	}

	public int[] solution(int n, int[] arr) {

		
		for(int i=0;i<n-1;i++) {
			int idx=1;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[idx]) idx=j;
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		return arr;
	}
}