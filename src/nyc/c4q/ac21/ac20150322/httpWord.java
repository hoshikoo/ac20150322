package nyc.c4q.ac21.ac20150322;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by Hoshiko on 3/22/15.
 */
public class httpWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input url");
        String input = scanner.nextLine();
        URL url = HTTP.stringToURL(input);
        String text = HTTP.get(url);
        text=text.toLowerCase();
        System.out.println("Please input a word");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        char searchChar = word.charAt(0);

        int count = 0;
        int searchIdx = 0;

        int index = text.indexOf(word);
        for(int i=0;i<text.length()- word.length() ;i++){
            if (index == -1) {

            }
            else {
                count= count+1;
            }
        }


        System.out.println(count);
    }

}