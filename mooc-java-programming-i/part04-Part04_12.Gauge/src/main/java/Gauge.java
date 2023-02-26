public class Gauge {

    private int value = 0;


    public Gauge ( ) {



    }

    public int value() {
        return  value;
    }
    public void increase(){
        if (value < 5 ) {
            value++;}
    }

    public void decrease() {

        if (value >0 ) {
        value--;}
    }
    public boolean full() {


         if (value == 5) {
             return  true;
         }

         return false;
    }

}
