import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        long [] salesSergey = {5,25,5,8,4,6,3,5,1,1515,81,444,77856,111,44};
        long [] salesSveta = {5,20,2,5,5,33,65,85,0,-455,2,3,5,88888888,5};

        SalesManager salesManagerSergey = new SalesManager(salesSergey);
        SalesManager salesManagerSveta = new SalesManager(salesSveta);

        System.out.println(salesManagerSergey.max());
        System.out.println(salesManagerSveta.max());

        System.out.println(salesManagerSergey.average());
        System.out.println(salesManagerSveta.average());
    }
}