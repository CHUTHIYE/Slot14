package shop.T2208A1;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Product> listProduct = new ArrayList<>();

    public Repository(){
        listProduct.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProduct.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProduct.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProduct.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProduct.add(new Product("05", "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProduct.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProduct.add(new Product("07", "Nước hoa hồng Soothing Facial Toner Simple", Category.COSMETICS, 140, 92000, 8));
        listProduct.add(new Product("08", "Combo gội xả HAIRBURST", Category.COSMETICS, 100, 639000, 7));
        listProduct.add(new Product("09", "Tinh chất dưỡng ẩm sâu Klái Rich Moist Soothing Serum", Category. COSMETICS, 50, 249000, 24));
        listProduct.add(new Product("10", "Kem dưỡng thể Paula's Choice RESIST WEIGHLESSVBODY TREATMENT", Category.COSMETICS, 80, 715000, 63));
        listProduct.add(new Product("11", "Aó thun TSUN", Category.FASHION, 250, 320000, 146));

    }
    public void show(){
        ///sử dụng foreach
        /*for (Product product : listProducts){
            System.out.println(product);
          }*/

        listProduct.forEach(product -> System.out.println(product));//sd lambda
    }

    public void sortProductByName(){
        //sd comparator
        /*ListProducts.sort(new Compparator<Product>(){
        *   @Override
        *   public int compare(Product o1, Product o2){
        *       return o1.getName().compareTo(o2.getName());
        *   }
        * });*/
        listProduct.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));//sd lambda
    }
    public void filterProductByPrice() {
//        for (Product product : listProducts) {
//            if (product.getPrice() > 10000) {
//                System.out.println(product);
//            }
//        }
        listProduct.stream()//sd lambda và stream
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSaale(){
        long count = listProduct.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();

        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }
}
