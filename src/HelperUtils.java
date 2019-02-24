import java.util.ArrayList;

public class HelperUtils {
    public static ArrayList<Object> collectAll(ArrayList<Object>objects, Filter f){
        ArrayList<Object> filteredList = new ArrayList<Object>();
        for(Object o: objects){
            if (f.accept(o)){
                filteredList.add(o);
            }
        }
        return filteredList;
    }
}