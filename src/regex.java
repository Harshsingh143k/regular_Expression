import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//lab ka maal
public class regex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write a target string");
        String s=sc.next();
        System.out.println("write pattern");
        String sp=sc.next();


        Pattern p=Pattern.compile(sp, Pattern.CASE_INSENSITIVE);//java have pattern case sencitive
        Matcher m=p.matcher(s);

        while(m.find()){

            System.out.println(m.start()+"  "+m.end()+"  "+m.groupCount());

        }
    }
}
