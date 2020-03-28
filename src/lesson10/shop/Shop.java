package lesson10.shop;


import java.util.*;


public class Shop<T extends Product> {

    private List<T> productList = new ArrayList<>();

    public void isSort() {
        TovarComparator comparator = new TovarComparator();
        Collections.sort(productList, comparator);
    }

    public void addProduct(T product) {

            productList.add(product);
    }



    public void removeList(Integer id) {
        Iterator<T> iterator=productList.iterator();
        while (iterator.hasNext()){
            T m=iterator.next();
            if(id.equals(m.getId())){
                iterator.remove();
            }
        }

    }
    public void editProduct(Integer id,T product,Integer newPrice,String newName){
        product.setPrice(newPrice);
        product.setName(newName);
        Iterator<T> iterator=productList.iterator();
        while (iterator.hasNext()){
            T nextProduct=iterator.next();
            if(id.equals(nextProduct.getId())){
                int index = productList.indexOf(product);
                productList.set(index, product);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        productList.forEach(it -> sb.append(it.toString() + ", "));

        return sb.toString();
    }

}
