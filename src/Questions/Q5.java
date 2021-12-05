//Q. Write a program to check whether the given mail id is valid or not
package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[A-Za-z0-9]+@(gmail|rediffmail|yahoo).(COM|com)");
        System.out.println("PLZ try to enter a valid email address");
        String str=sc.next();
        Matcher m= p.matcher(str);
        if(m.matches()){
            System.out.println(m.group()+"  accepted as a VALID_MAIL");
        }else{
            System.out.println(str+" rejected as a NON_VALID_MAIL");
        }
    }
}
