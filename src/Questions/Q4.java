//Q. Write a program to check whether the given no is a valid mobile number or not? The mobile no is entered by the command line argument
        package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[6-9][0-9]{9}");
        String str=sc.next();
        Matcher m= p.matcher(str);
        if(m.matches()){
            System.out.println(m.group()+" accepted as a mobile number");
        }
        else{
            if(str.length()>10){
                System.out.println(str+"  rejected as a mobile number, because length is MAX then 10");
            }
            else if(str.length()<10){
                System.out.println(str+" rejected as a mobile number, because  length is  MIN then 10");
            }
            else{
                System.out.println(str+"  rejected as a mobile number, because is in Wrong Format");

            }
        }
    }
}
