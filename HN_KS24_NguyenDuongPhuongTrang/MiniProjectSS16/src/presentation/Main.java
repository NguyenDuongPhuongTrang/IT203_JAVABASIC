package presentation;

import java.util.List;
import java.util.Map;
import java.util.Comparator;

import services.ProductRepository;
import model.ElectronicProduct;
import model.FoodProduct;
import model.Product;

public class Main {
    public static void main(String[] args) {

        ProductRepository product = new ProductRepository();

        // Thêm sản phẩm
        product.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        product.add(new ElectronicProduct("E02", "Mouse", 500000, 6));
        product.add(new FoodProduct("F01", "Milk", 30000, 10));
        product.add(new FoodProduct("F02", "Cake", 50000, 20));

        // Hiển thị toàn bộ sản phẩm
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : product.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("----------------------");
        }

        // Tìm theo ID
        System.out.println("\n=== TÌM KIẾM THEO ID ===");
        Product found = product.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy sản phầm nào!");
        }

        // Sắp xếp theo giá tăng dần
        System.out.println("\n=== SẮP XẾP GIÁ TĂNG DẦN ===");
        List<Product> sortedList = product.findAll();
        sortedList.sort(Comparator.comparingDouble(Product::getPrice));

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - " + p.getPrice());
        }

        // Thống kê theo loại
        System.out.println("\n=== THỐNG KÊ THEO LOẠI ===");
        Map<String, Integer> statistics = product.countByType();
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}