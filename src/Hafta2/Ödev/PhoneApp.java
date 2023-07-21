package Hafta2.Ödev;

public class PhoneApp  {
    public static void main(String[] args) {
        SmartPhone[] smartPhoneArray = new SmartPhone[5];
        smartPhoneArray[0] = new SmartPhone(1, "Samsung A6", 2899.99, "05554567899",16, 64, 16);
        smartPhoneArray[1] = new SmartPhone(2, "Samsung C7",3299.99, "05556545321", 21, 64, 16);
        smartPhoneArray[2] = new SmartPhone(3, "iPhone 11", 5799.99, "05552223333", 32, 128, 32);
        smartPhoneArray[3] = new SmartPhone(4, "iPhone 12", 6899.99, "05554445556", 18, 128, 32);
        smartPhoneArray[4] = new SmartPhone(5, "Samsung M12",4199.99, "05123245678", 32, 128, 32);


        double totalPrice = calculateTotalPrice(smartPhoneArray);
        System.out.println("Toplam fiyat: " + totalPrice);
    }
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double totalPrice = 0;
        for (SmartPhone phone : smartPhoneArray) {
            totalPrice += phone.price;
        }
        return totalPrice;
    }
}
