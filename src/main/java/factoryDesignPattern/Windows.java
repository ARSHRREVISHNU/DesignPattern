package factoryDesignPattern;

import java.sql.SQLOutput;

public class Windows implements OperatringSystems{


    @Override
    public void spec() {
        System.out.println("You are in Windows");
    }
}
