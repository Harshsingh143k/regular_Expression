import java.util.Scanner;
//lab ka maal
public class reg89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"abcd","jsnj","husbd","ddjd"};//
        for(String res:arr){//
            if(res.matches("[a-z]{4}")==true){
                System.out.println(res);//it will return the matches value
            }
        }


        String ar[]={"abcd@gmail.com","jsnj","husbd@yahoo.com","ddjd"};//
        for(String resu:ar){//
            if(resu.matches("[a-z]+@(gmail|yahoo).com")==true){
                System.out.println(resu);//it will return the matches value
            }
        }

        //System.out.println(st.matches("[a-z]{}"));

    }
}
