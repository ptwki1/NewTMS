package lesson10.shop;

public class Product   {
    private Integer id;
    private String name;
    private Integer price;
    private static Integer idCount = 1;
    public Product( String name, Integer price) {
        this.id =idCount;
        this.name = name;
        this.price = price;
        idCount++;
    }


    public Product() {
    }

    public Integer getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
