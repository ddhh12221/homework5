package homework5;

import java.util.*;

public class MaxAndMin {
	void input(){
		int  min=100, max=0, i=0;

			Scanner s = new Scanner(System.in);
		
		

	        String strData = "";

	        while (true){
	            System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
	            try {
	                strData = s.next().trim().toLowerCase();
	                int iData = Integer.parseInt(strData);
	                if(iData>=0 && iData<=100)
	                {
	                    if(min>iData){ min = iData; }
	                    else if(max<iData){ max = iData; }
	                }
	                else if(iData<0 || iData>100){ System.out.println("�����ʰ��Դϴ�"); }
	            }
	            catch (NumberFormatException e){
	            	
	                if("q".equals(strData)){
	                	System.out.println("�Էµ� ������ ���� ū ���� " + max + "�Դϴ�."+"�Էµ� ������ ���� ���� ���� " + min + "�Դϴ�.");
	                new ExamForWhile().start(); 
	                break; 
	                }
	                else { System.out.println("�Է°� Ȯ��"); }
	            }
	        }
	    }
	}

