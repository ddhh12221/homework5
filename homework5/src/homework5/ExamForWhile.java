package homework5;

import java.util.*;

public class ExamForWhile {



    public static void main(String[] args){

        new ExamForWhile().start();
    }

    void start(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. 1���� �Է��� ������ ���ϱ�");
        System.out.println("2. �ִ밪/�ּҰ����ϱ�");
        System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
        System.out.println("4. ���ϴ� ������ ����ϱ�");
        System.out.println("5. ¦����/Ȧ���� ����ϱ�");
        System.out.println("6. �����ϱ�");
        System.out.print("���ϴ� �޴��� >>");
        try {
            int d = s.nextInt();
            new ExamForWhile().next(d);
        } catch (InputMismatchException e) {
            System.out.println("�Է°� Ȯ��");
            this.start();
        }
    }

    void next(int i){
        if(i==1) { new SumOfNumbers().input(); }
        else if(i==2) { new MaxAndMin().input(); }
        else if(i==3) { new SumAndAvg().input(); }
        else if(i==4) { new GuGuDan().input(); }
        else if(i==5) { new GuGuDan2().input(); }
        else if(i==6) { System.out.println("�����մϴ�."); System.exit(0); }
        else { System.out.println("�Է°� Ȯ���ϼ���."); }
    }
}