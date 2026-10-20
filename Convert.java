import java.util.*;
public class Convert {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String bits = sc.next();
      int result = 0;
      for(int i = 0;i < bits.length();i++){
        int bit = bits.charAt(i) - '0';
        result = result * 2 + bit;
      }
      System.out.println(result);
  }
}