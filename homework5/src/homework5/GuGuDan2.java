package homework5;

import java.util.Scanner;

public class GuGuDan2 {
    void input(){
        String strData = "";
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("¦���� : E Ȧ���� : O (����� : Q)");
            strData = s.next().trim().toLowerCase();
            if("e".equals(strData)){
                for(int i=2; i<=8; i=i+2){
                    for(int j=1; j<=9; j++){
                        System.out.println(i+"*"+j+"="+(i*j));
                    }
                }
            }
            else if("o".equals(strData)){
                for(int i=1; i<=9; i=i+2){
                    for(int j=1; j<=9; j++){
                        System.out.println(i+"*"+j+"="+(i*j));
                    }
                }
            }
            else if("q".equals(strData)){ new ExamForWhile().start(); }
            else { System.out.println("�Է°� Ȯ���ϼ���."); }
        }
    }
}