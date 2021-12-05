//Q. Write a regular expression to represent all names end with J | j
package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Pattern p= Pattern.compile("[A-Za-z]+[j|J]");
        Matcher m=p.matcher(s);
        if(m.matches()){
            System.out.println(m.group()+" accepted as a name");

        }else{
            System.out.println(s+" rejected as a name");
        }


    }
}
