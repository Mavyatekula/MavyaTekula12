public class Product {
    public double price=1500.0d;
    public double getPrice(){
        return price;
    }

    public double getPrice(int quantity)
    {
        double totalPrice=quantity*price;
        return totalPrice;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
}
