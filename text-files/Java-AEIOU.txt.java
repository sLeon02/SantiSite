/*
Santiago Leon
*/

import java.util.*;

public class MyClass {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    scan.nextLine();
    int count = 0;
    for(int i=0;i<a;i++){
        String str = scan.nextLine();
        String  stra = str.toUpperCase();
        for(int j=0;j<str.length();j++){
            if(stra.charAt(j)=='A'){
                count += 1;
            }
            else if(stra.charAt(j)=='E'){
                count += 1;
            }
            else if(stra.charAt(j)=='I'){
                count += 1;
            }
            else if(stra.charAt(j)=='O'){
                count += 1;
            }
            else if(stra.charAt(j)=='U'){
                count += 1;
            }
        }
    
        System.out.println(count);
        count = 0;
    }
  }
}