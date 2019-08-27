import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
          int b = scanner.nextInt();
          int sum = a+b;
          int diff = a-b;
          System.out.println(sum + "\n" + diff);
        }
}