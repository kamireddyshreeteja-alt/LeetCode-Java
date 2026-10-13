import java.util.Scanner;
public class CountDigits {
    static int CountDigits(int num){
    int original = num;
    int count = 0;
    while(num > 0){
      int digits = num % 10;
      if(digits != 0 && original % digits == 0){
        count = count + 1;
      }
      num = num / 10;
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(CountDigits(num));
    sc.close();
  }
}