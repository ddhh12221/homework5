package homework5;

import java.util.Scanner;

public class GuGuDan2 {
	void input(){
		while(true){
			System.out.println("1���� �Է��Ͻ� ����ŭ ���� ���մϴ�.");
			Scanner s = new Scanner(System.in);
		
		int i= s.nextInt();
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
