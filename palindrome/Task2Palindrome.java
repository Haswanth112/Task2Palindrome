import java.util.Scanner;
class Palindrome{
    public static void main(String args[])
    {
        System.out.print("Enter your string:");
        Scanner sc = new Scanner(System.in);
        String Reversestr ="";
        String str;
        str = sc.nextLine();
        for(int i=0; i<str.length();i++){
            Reversestr = str.charAt(i)+Reversestr;
        }
        if(str.equals(Reversestr))
        System.out.println("Palindrome");
        else
        System.out.println("Not a palindrome");
    }
}
