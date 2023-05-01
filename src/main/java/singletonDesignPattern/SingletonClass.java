package singletonDesignPattern;

public class SingletonClass {

    public static void main(String args[]){
      Thread t1 = new Thread(new Runnable() {
          @Override
          public void run() {
              Sample obj = Sample.getInstance();
          }
      }

      );
      Thread t2 = new Thread(new Runnable() {
          @Override
          public void run() {
              Sample obj = Sample.getInstance();
          }
      });
      t1.start();
      t2.start();
    }
}

class Sample{

    public static Sample obj =  new Sample();
    private Sample(){
        System.out.println("Instance is created");
    }
    public static Sample getInstance(){
        if(obj == null){
            synchronized (Sample.class){
                if(obj == null)
                obj = new Sample();

            }

        }
        return obj;
    }
}