package buoi4;

public class ServicePackage {
    private String name;
    private int duration;
    private double price;
    public ServicePackage(String _name, int _duration, double _price) {
        this.name= _name;
        this.duration= _duration;
        this.price= _price;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Gói:" + name + "Thời hạn:" + duration + "tháng,giá:" + price;
    }
}
