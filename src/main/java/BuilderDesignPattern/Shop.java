package BuilderDesignPattern;

public class Shop {

    public static void main(String args[]){
        Phone p = new PhoneBuilder().setOs("Android").setName("Micromax").setRam(8).setScreenSize(8).getPhone();
        System.out.println(p);
    }
}
