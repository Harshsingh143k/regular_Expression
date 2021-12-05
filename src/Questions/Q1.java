//Q Write a regular expression to represent all names start with N | n  with any length
package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" input name starting from N-or-n");
        String s=sc.nextLine();
        Pattern p=Pattern.compile("[N|n][A-Za-z]+");
        Matcher m =p.matcher(s);
        if(m.matches()){
            System.out.println(m.group()+" Accepted as a Name");
        } else{
            System.out.println(s+" Rejected as a Name");
        }
    }
}
