package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,3,7,3,5,14,27,1,5,3,-2,8,1,3,5};
        Histogram histo = new Histogram (data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }            
    }    
}
