package test;

import java.util.*;

import org.omg.CORBA.MARSHAL;

import java.io.*;

public class Main5_5 {

	public static void main(String[] args) {
		
		Main5_5 T = new Main5_5();
		
		Scanner sc = new Scanner(System.in);
	
		String str=sc.next();
		System.out.println(T.solution(str));

	}


	public int solution(String str) {
		
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x:str.toCharArray()) { // str array를 만들어 줌으로서  stack이 int 값인데 하나씩 배열로 비교 할 수 있게
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				int rt=stack.pop();
				int lt=stack.pop();
				
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
			
		}
	
		answer+=stack.get(0);

		return answer;
		
	}

}