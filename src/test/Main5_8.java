package test;

import java.util.*;

import org.omg.CORBA.MARSHAL;

import java.io.*;

public class Main5_8 {

	public static void main(String[] args) {

		Main5_8 T = new Main5_8();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();

		}

		System.out.println(T.solution(n, m, arr));
	}

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		Queue<Person> Q = new LinkedList<Person>();
		
		for(int i=0;i<n;i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp=Q.poll();
			for(Person x:Q) {
				if(x.priority>tmp.priority) {
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
				else answer++;
			}
			
		}
		return answer;
	}
}

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}