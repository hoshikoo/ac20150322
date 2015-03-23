package nyc.c4q.ac21.ac20150322;

/**
 * Created by Hoshiko on 3/22/15.
 */

import java.util.Scanner;

public class rot13Encode {
    public static String rot13Encode(String string) {
        char decode;
        String message="";

        for(int i=0; i<string.length(); ++i){
            char c = string.charAt(i);
            int code =(int)c;

            if (code >77&&code<=90){

                code = code +13 -26;
                decode = (char)code;
                message +=decode;

            }
            else if (code>=65 &&code <=77){

                code = code +13;
                decode = (char)code;
                message +=decode;

            }else if (code >109&&code<=122){

                code = code +13 -26;
                decode = (char)code;
                message +=decode;

            }else if (code>=97 &&code <=109){

                code = code +13;
                decode = (char)code;
                message +=decode;

            }else {

                decode = (char)code;
                message +=decode;

            }
        }
        return message;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your message;");
        String str = input.nextLine();
        //str = str.toUpperCase();
        System.out.println(rot13Encode(str));
    }
}
