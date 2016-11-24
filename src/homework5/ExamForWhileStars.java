package homework5;

import java.util.*;

public class ExamForWhileStars {

   public static void main(String[] args) {
      int c;

      Scanner s = new Scanner(System.in);

      

      System.out.println("1. 정사각형별");
      System.out.println("2. 직각삼각 별");
      System.out.println("3. 이등변삼각형 별");
      System.out.println("4. 다이아몬드 별  ");
      System.out.println("5. 종료하기");
      System.out.print("원하는 모양을 별을 선택하세요.");
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
         System.out.println("종료하셨습니다.");
   }
}