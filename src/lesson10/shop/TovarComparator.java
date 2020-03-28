package lesson10.shop;

import java.util.Comparator;

public class TovarComparator implements Comparator<Product> {

    @Override
    public int compare(Product tovar, Product t1) {
            return Double.valueOf(tovar.getPrice()).compareTo(Double.valueOf(t1.getPrice())) ;
    }
}
