import java.util.Scanner;

public class CountNoOfCharacter {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = scan.next();
        System.out.println("Enter the Character to be count in the String");
       char ch = (char) System.in.read();
        int count = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(ch== c)
            count++;
        }
        System.out.println(count);

    }
}
