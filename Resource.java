import java.util.Random;
import java.io.*;

public class Resource {
    String word = new String();
    String[]alist = new String[8];
    Resource ()
    {
        Random rand = new Random();
        //head = rand.nextInt(50);
        //temp = rand.nextInt(50);
        File file = new File("/Users/Jack/Documents/CodingPrac/Project1/src/lib");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            int counter = 0;
            while ((st = br.readLine()) != null){
                alist[counter] = st;
                ++counter;
            }
            int num = rand.nextInt(7);
            word = alist[num];
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
