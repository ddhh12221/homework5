package homework5;

import java.util.Scanner;

public class SumAndAvg {
	void input(){
		
		int  i=0, v=0,sum=0, avg=0;
		while(true){
			System.out.println("���ڸ� �Է�(Q:����) >>");
			Scanner s = new Scanner(System.in);
		
		
		int c= s.nextInt();
		
		v=v+c;
		i++;
		
		if(c=='q')
		{
			sum=v;
			avg=v/i;
			  System.out.print("����" + sum + "�̰�,");
			  System.out.println("�����" + avg + "�Դϴ�.");
			break;
		}
		
	}
	}
}
