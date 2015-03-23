package nyc.c4q.ac21.ac20150322;

/**
 * Created by Hoshiko on 3/22/15.
 */

import java.net.URL;


public class makeHttpUrl {
    public static URL makeHttpUrl(String host, int port, String path) {
        URL url;
        if(port==80){
            url = HTTP.stringToURL("http://"+host+"/"+path) ;
        }else{
            url = HTTP.stringToURL("http://"+host+":"+port+"/"+path) ;
        }
       return url;
    }

    public static URL makeHttpUrl(String host, String path) {
        return makeHttpUrl(host, 80, path);
    }

    public static void main(String [] args) {
        URL url = makeHttpUrl("github.com", 80, "/accesscode-2-1/unit-0" );
        System.out.println(url);
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
    }
}
