import java.util.*;
public class NumberOfSteps {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int steps = 0;
    while(num > 0){
      if(num % 2 == 0){
        num = num / 2;
      }else{
        num -= 1;
      }
      steps += 1; 
    }
    System.out.println(steps);
  }
}