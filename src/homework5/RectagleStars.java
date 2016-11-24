package homework5;

import java.util.*;

public class RectagleStars {
   private int size;
   
    void start() {
       this.input();
       this.print();
    }
    
    void input(){
       Scanner s = new Scanner(System.in);
       
      System.out.print("정사각형 크기입력: "); 
      
      this.size = s.nextInt();
      System.out.print("\n");
    }
    
    void print(){
       int star = this.size;
        for(int i=0;i<star;i++) {
             for (int j=0;j<star;j++)
              System.out.print("*");
             
             System.out.print("\n");
        }
        
        System.out.print("\n");
    }
}