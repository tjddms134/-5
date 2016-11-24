package homework5;

import java.util.*;

public class DiamondStars {
   private int size;

   void start() {
      this.input();
      this.print();
   }

   void input() {
      Scanner s = new Scanner(System.in);

      System.out.print("다이아몬드의 크기입력: ");

      this.size = s.nextInt();
      System.out.print("\n");
   }

   void print() {
      int star = this.size;
      int l = 1;
      boolean isTop = true;

      while (l > 0) {
         for (int j = 1; j <= star - l; j++)
            System.out.print(" ");
         for (int j = 1; j <= (l * 2) - 1; j++)
            System.out.print("*");

         System.out.print("\n");

         if (l == star)
            isTop = false;
         if (isTop)
            l++;
         else
            l--;
      }

      System.out.print("\n");
   }
}