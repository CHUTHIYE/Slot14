package shop.T2208A1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Repository r = new Repository();
        Scanner sc = new Scanner(System.in);
        Menu.mainMenu();
        int choose = sc.nextInt();
        switch (choose){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM");
                r.show();
                break;
            case 2:
                System.out.println("Các sản phẩm có giad trên 10000: ");
                r.filterProductByPrice();
                break;
            case 3:
                r.countProductByAmountSaale();
                break;
            case 7:
                r.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                r.show();
        }
    }

}
