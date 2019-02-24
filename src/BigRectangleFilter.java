public class BigRectangleFilter implements Filter {

    public boolean accept(Object x){
        boolean result = false;
        if (x instanceof Rectangle) {
            Rectangle r = (Rectangle)x;
            if (r.calculatePerimeter()>10){
                result = true;
            }else{
                return result;
            }

        }
        return result;

    }



}

