package factoryDesignPattern;

public class ObjectGenerator {
    public OperatringSystems objects(int value){
        if(value == 1)
            return new Android();
        else if (value == 2)
            return new Windows();
        else
            return new IOS();
    }
}
