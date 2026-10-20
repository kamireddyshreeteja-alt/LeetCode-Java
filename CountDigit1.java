import java.util.*;
public class CountDigit1 {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String text = String.valueOf(num);
    int count = 0;
    for(int i = 0;i < text.length();i++){
      int digit = text.charAt(i) - '0';
      if(num % digit == 0){
        count = count + 1;
      }
    }
    System.out.println(count);
  }
}