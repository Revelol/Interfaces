import java.util.ArrayList;

public class BigRectLister {
    public static void main (String[] args){
        ArrayList<Object> recList = new ArrayList<Object>();
        BigRectangleFilter bigR = new BigRectangleFilter();
        recList.add(BigRectLister.makeRec(6.0,3.0));
        recList.add(BigRectLister.makeRec(7.0,2.0));
        recList.add(BigRectLister.makeRec(4.0,1.9));
        recList.add(BigRectLister.makeRec(2.34,0.2));
        recList.add(BigRectLister.makeRec(1.01,8.21));
        recList.add(BigRectLister.makeRec(1.2,5.9));
        recList.add(BigRectLister.makeRec(3.23,1.1));
        recList.add(BigRectLister.makeRec(0.2,0.99));
        recList.add(BigRectLister.makeRec(8.0,1.0));
        recList.add(BigRectLister.makeRec(5.01,0.09));
        recList.add(BigRectLister.makeRec(7.0,3.0));
        recList.add(BigRectLister.makeRec(7.28,4.09));
        recList.add(BigRectLister.makeRec(3.0,2.0));
        recList.add(BigRectLister.makeRec(4.0,1.0));
        recList.add(BigRectLister.makeRec(1.0,0.3));
        recList.add(BigRectLister.makeRec(9.0,11.0));
        recList.add(BigRectLister.makeRec(1.67,2.0));
        recList.add(BigRectLister.makeRec(4.0,1.0));
        recList.add(BigRectLister.makeRec(5.34,1.87));
        recList.add(BigRectLister.makeRec(9.56,0.99));
        recList.add(BigRectLister.makeRec(6.56,2.8));
        ArrayList<Object> filteredList = HelperUtils.collectAll(recList,bigR);
        for(Object o : filteredList){
            Rectangle r = (Rectangle) o;
            ((Rectangle) r).printDimension();
        }


    }
    public static Rectangle makeRec(double length, double width){
        Rectangle r = new Rectangle(length, width);
        return r;

    }
}
