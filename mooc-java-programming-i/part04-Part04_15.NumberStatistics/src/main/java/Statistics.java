public class Statistics {
    private int count;
    private int sum = 0;


    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count+=1;
        sum+=number;
    }

    public int getCount() {
        return  count;
    }

    public int sum() {
        return  sum;
    }

    public double average() {
        double s = Double.valueOf(sum);

        if (s > 0) {


            return s / count;
        }
        else {
            return  0.0;
        }




    }


}