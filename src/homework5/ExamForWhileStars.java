package homework5;

import java.util.*;

public class ExamForWhileStars {

   public static void main(String[] args) {
      int c;

      Scanner s = new Scanner(System.in);

      

      System.out.println("1. ���簢����");
      System.out.println("2. �����ﰢ ��");
      System.out.println("3. �̵�ﰢ�� ��");
      System.out.println("4. ���̾Ƹ�� ��  ");
      System.out.println("5. �����ϱ�");
      System.out.print("���ϴ� ����� ���� �����ϼ���.");
      c = s.nextInt();
      if (c == 1)
         new RectagleStars().start();

      else if (c == 2)
         new TriangleStars().start();

      else if (c == 3)
         new IsoscelesTriangleStars().start();

      else if (c == 4)
         new DiamondStars().start();

      else if (c != 5)
         System.out.println("�����ϼ̽��ϴ�.");
   }
}