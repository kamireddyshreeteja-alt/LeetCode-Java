import java.util.*;
public class AddBinary {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    String result = "";
    while(i >= 0 || j >= 0 || carry > 0){
      int sum = carry;
      if(i >= 0){
        sum = sum + (a.charAt(i) - '0');
        i--;
      }
      if(j >= 0){
        sum = sum + (b.charAt(j) - '0');
        j--;
      }
      result = (sum % 2) + result;
      carry = sum / 2;
    }
    System.out.println(result);

  }
}
