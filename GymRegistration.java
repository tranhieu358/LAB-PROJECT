package buoi4;

import java.util.ArrayList;
import java.util.List;

public class GymRegistration{
private Member member;
    private List<ServicePackage> packages;

    public GymRegistration(Member member) {
        this.member = member;
        this.packages = new ArrayList<>();
    }

    public void addPackage(ServicePackage pkg) {
        packages.add(pkg);
    }

    public double calculateTotal() {
        double total = 0;
        for (ServicePackage pkg : packages) {
            total += pkg.getPrice();
        }
        if (packages.size() >= 2) {
            total *= 0.95; 
        }
        return total;
    }

    public void printInfo() {
        System.out.println(member);
        System.out.println("Các gói đã đăng ký:");
        for (ServicePackage pkg : packages) {
            System.out.println(" - " + pkg);
        }
        System.out.println("Tổng tiền phải trả: " + calculateTotal() + " VND");
    }
}