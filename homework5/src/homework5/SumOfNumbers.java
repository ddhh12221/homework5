package homework5;


import java.util.*;
public class SumOfNumbers {
	void input(){
		
		while(Quit == "q"){
			System.out.println("1���� �Է��Ͻ� ����ŭ ���� ���մϴ�.");
			Scanner s = new Scanner(System.in);
		
		int i= s.nextInt();
		int v=0, a=0;
		for( v=1; v<=i;i++)
		{
			a=a+v;
		}
		
		System.out.println("�� ���� "+ a+"�Դϴ�.");
		char c= s.next();
		}
	}
	
	
}
