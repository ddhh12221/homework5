package homework5;

import java.util.Scanner;


public class GuGuDan {
    void input(){
        int iData = 1;
        String strData = "";
        Scanner s = new Scanner(System.in);
        while (true){
            try {
                System.out.print("����ϰ���� �� : (����� : Q)");
                strData = s.next().trim().toLowerCase();
                iData = Integer.parseInt(strData);
                if(iData<=1 || iData>=10){
                    System.out.println("�߸��Է�");
                }
                else {
                    for(int i=1; i<=9; i++){
                        System.out.println(iData + " * " + i + " = " + iData*i);
                    }
                }
            }catch (NumberFormatException e){
                if("q".equals(strData)){
                    new ExamForWhile().start();
                }
                else System.out.println("�Է°� Ȯ���ϼ���");
            }
        }
    }
}