package homework5;

import java.util.Scanner;

public class MaxAndMin {
	void input(){
		int  i=0, v=0, a[]={}, min=100, max=0;
		while(true){
			System.out.println("0~100������ ���ڸ� �Է�(Q:����) >>");
			Scanner s = new Scanner(System.in);
		
		
		int c= s.nextInt();
		
		if(i>=0&&i<=100){
		a[v]=c;
		
		v++;
		}
		else if(c=='q')
		{
			for(int t=0; t<a.length; t++)
			{
				if (a[t]>max)
				{
					max=a[t];
				}
				if(a[t]<min)
				{
					min=a[t];
				}
			}
			  System.out.println("�Էµ� ������ ���� ū ���� " + max + "�Դϴ�.");
			  System.out.println("�Էµ� ������ ���� ���� ���� " + min + "�Դϴ�.");
		}
	}


	
	}

}
