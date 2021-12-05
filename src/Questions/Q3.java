//Q Write a regular expression to represent all names start with N|n  and ends with j|J
package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NAME starting from n|N and ending with J|j");
        String str=sc.nextLine();

        Pattern p= Pattern.compile("[N|n][A-Za-z]+[J|j]");
        Matcher m=p.matcher(str);
        if(m.matches()){
            System.out.println(m.group()+" accepted as a name");

        }else{
            System.out.println(str+" rejected as a name");
        }
    }
}
