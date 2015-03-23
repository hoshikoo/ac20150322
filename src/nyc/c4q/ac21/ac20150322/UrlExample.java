package nyc.c4q.ac21.ac20150322;

/**
 * Created by Hoshiko on 3/22/15.
 */

import java.net.URL;
public class UrlExample {
    public static void main(String [] args){
        URL url = HTTP.stringToURL("http://alexsamuel.net");
        System.out.println(url.getHost());

    }
}
