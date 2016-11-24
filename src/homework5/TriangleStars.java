package homework5;

import java.util.*;

public class TriangleStars {
   private int size;

   void start() {
      this.input();
      this.print();
   }

   void input() {
      Scanner s = new Scanner(System.in);

      System.out.print("직각삼각형 크기입력: ");

      this.size = s.nextInt();
      System.out.print("\n");
   }
   void print() {
      int l = this.size;
      System.out.printf("%n1) 왼쪽 직각 삼각형%n");

      for (int i = 0; i < l; i++) {
         for (int j = 0; j <= i; j++)
            System.out.print("*");

         System.out.println();
      }

      
      System.out.printf("%n2)오른쪽 직각 삼각형%n");

      for (int i = 0; i < l; i++) {
         for (int j = 0; j < (l - i - 1); j++)
            System.out.print(" ");

         for (int j = 0; j < i + 1; j++)
            System.out.print("*");

         System.out.println();
      }
   }

}