package lesson10.shop;

public class Runner {
    public static  void main(String[] agrs) {

        Shop<Product> shop = new Shop<Product>();
        Product product=new Product("Хлебушек",12);
        Product product2=new Product("Кортошечка",10);
        Product product3=new Product("Котлетки",1344);
        shop.addProduct(product);
        shop.addProduct(product2);
        shop.addProduct(product3);
        System.out.println(shop.toString());
        shop.isSort();
        System.out.println("отсортировали по цене");
        System.out.println(shop.toString());
        shop.removeList(product.getId());
        shop.removeList(product3.getId());
        System.out.println(shop.toString());
        shop.editProduct(product2.getId(),product2,15,"Бульбочка");
        System.out.println(shop.toString());


    }


}
