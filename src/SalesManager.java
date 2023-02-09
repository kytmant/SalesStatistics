public class SalesManager {
    protected long[] sales;
    protected long min = 2_147_483_647;
    protected long max = -1;
    protected long avg;
    protected long average;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {

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