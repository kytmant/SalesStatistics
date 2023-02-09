public class SalesManager {
    protected int[] sales;
    protected int min = 2_147_483_647;
    protected int max = -1;
    protected int avg;
    protected int average;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {

        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {

        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            avg = sales[i];
            if ((avg == max) || (avg == min)) {
                continue;
            }
            sum += avg;
        }
        average = sum / sales.length;
        return average;
    }
}