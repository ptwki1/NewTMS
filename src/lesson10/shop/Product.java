package lesson10.shop;

public class Product extends Tovar  {
    private Integer id;
    private String name;
    private Integer price;

    public Product(Integer id, String name, Integer price) {
        this.id =initId(id);
        this.name = name;
        this.price = price;
    }

    public Integer initId(Integer id){
       Integer random=(int)(Math.random()*id);
        return random;
    }
    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
