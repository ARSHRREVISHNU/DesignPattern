package BuilderDesignPattern;

public class Phone {

    private String name;
    private String os;
    private int ram;
    private double screenSize;
    public Phone(String name, String os, int ram, double screenSize){
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "name="+name+"os="+os+"ram="+ram+"screensize="+screenSize;
    }
}
