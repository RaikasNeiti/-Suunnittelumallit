package Teht2;


import java.io.FileInputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        JavaKoodaja jasper = new Jasper();
        Class c;
        AbstractFactory factory = null;
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("factory.properties"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            c = Class.forName(properties.getProperty("factory"));
            factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        jasper.pueVaatteet(factory);
        System.out.println(jasper);
        System.out.println("Jasper Valmistuu");

        AbstractFactory factory2 = new BossFactory();
        jasper.pueVaatteet(factory2);
        System.out.println(jasper);

    }
}
