package nyc.c4q.ac21.ac20150322;

/**
 * Created by Hoshiko on 3/22/15.
 */
import java.net.URL;
public class exitTicket {

    public static boolean isMoney(char c) {
        int code =(int)c;
        if (code == 36)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isMoney('A'));
    }
/*
    public static void main(String [] args) {
        URL url = HTTP.stringToURL("http://www.theguardian.com/books/2015/feb/09/centireading-force-reading-book-100-times-great-idea?utm_medium=twitter&utm_source=dlvr.it");


        System.out.println("Host Name: "+ url.getHost());
        System.out.println("Port: "+ url.getPort());
        System.out.println("Path: "+ url.getPath());
    }
*/
}
