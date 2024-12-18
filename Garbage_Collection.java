package Collection_Framework;
import java.lang.ref.WeakReference;
import java.util.*;
public class Garbage_Collection {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple","16 pro max");
        System.out.println(phone);
        phone = null;

        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsumg","S24") );
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }
        catch(Exception ignored){

        }
        System.out.println(phoneWeakReference.get());
    }
}
class Phone{
    String model;
    String brand;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "phone{" + "model='" + model + '\'' + ", brand='" + brand + '\'' + '}';
    }
}
