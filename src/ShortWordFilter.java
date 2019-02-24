import java.util.ArrayList;
public class ShortWordFilter implements Filter {
    public boolean accept(Object x){
        boolean result = true;
        String temp = (String)x;
        if (temp.length() < 5){
            return result;
        }else{
            return !result;
        }
    }

}


