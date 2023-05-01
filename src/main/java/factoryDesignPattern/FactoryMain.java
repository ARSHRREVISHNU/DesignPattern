package factoryDesignPattern;

public class FactoryMain {
    public static void main(String args[]){
        ObjectGenerator obj = new ObjectGenerator();
        OperatringSystems os = obj.objects(1);
        os.spec();
        os = obj.objects(2);
        os.spec();
        os = obj.objects(3);
        os.spec();
    }
}
