package homework5;

import java.util.Scanner;

public class GuGuDan {
	void input(){
		while(true){
			System.out.println("����ϰ� ���� ��(Q:����) >>");
			Scanner s = new Scanner(System.in);
		
		int i= s.nextInt();
		if (i>1&&i<10)
		{
			for(int r=0; r<10;r++)
			{
				System.out.println("");
			}
		}
		int v=0, a=0;
		for( v=1; v<=i;i++)
		{
			a=a+v;
		}
		
		System.out.println("�� ���� "+ a+"�Դϴ�.");
		String c= s.next();
		if (c=="q")
		{
			break;
		}
	}
	}
}
