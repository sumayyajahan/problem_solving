import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaWithStream {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        //adding products
        productList.add(new Product(1,"HP Laptop", 25000f));
        productList.add(new Product(2,"Acer Laptop", 15000f));
        productList.add(new Product(3,"Samsung Laptop", 25000f));
        productList.add(new Product(4,"DELL Laptop", 25000f));
        productList.add(new Product(5,"Philips Laptop", 25000f));

        List<Float> productPriceList = productList.stream()
                .filter(p -> p.price > 3000)
                .map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(productPriceList);

    }
}
