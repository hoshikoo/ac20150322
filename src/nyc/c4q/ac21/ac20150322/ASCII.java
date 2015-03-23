package nyc.c4q.ac21.ac20150322;

/**
 * Created by Hoshiko on 3/22/15.
 */
public class ASCII {
    public static void main(String args[]){
        String greeting = "Hello, world!";
        for(int i=0; i<greeting.length(); ++i){
            char c = greeting.charAt(i);
            int code =(int)c;
            System.out.println("char "+c+" = " +code);
        }
    }
    public static void cast() {
        double pi = 3.14159;
        int mostOfPu = (int) pi; //this will return 3
        //double pi = 3.0;
        //int mostOfPi = pi; //this will return 3.  in this case we do not loose anything so we do not need (int)
        int x = 42;
        double y = x;  //y will return 42.0 
    }


}
