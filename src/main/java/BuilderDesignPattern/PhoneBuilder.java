package BuilderDesignPattern;

public class PhoneBuilder {

    private String name;
    private String os;
    private int ram;
    private double screenSize;

    public PhoneBuilder setOs(String os){
            this.os = os;
            return this;
    }
    public PhoneBuilder setName(String name){
        this.name = name;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        this.ram = ram;
    return this;
    }
    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }

    public Phone getPhone()
    {

        return new Phone(os,name, ram,screenSize);
    }
}
