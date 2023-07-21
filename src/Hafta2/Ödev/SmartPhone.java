package Hafta2.Ödev;

public class SmartPhone extends Phone {

    int camera;
    int storage;
    int ram;

    public SmartPhone(){

    }

    public SmartPhone(int id, String name, double price, String phoneNumber, int camera,int storage,int ram ) {
        this.id = id;
        this.name = name;
        this.price = (int) price;
        this.phoneNumber = phoneNumber;
        this.camera = camera;
        this.storage = storage;
        this.ram = ram;

    }

}
