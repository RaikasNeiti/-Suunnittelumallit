package Teht5;

public class SingletonTyontekija {
    private static SingletonTyontekija instance;
    private Tyontekija tyontekija;

    private SingletonTyontekija(Tyontekija tyontekija){
        this.tyontekija = tyontekija;
    }

    public static SingletonTyontekija setIntance(Tyontekija tyontekija){
        if(instance == null){
            instance = new SingletonTyontekija(tyontekija);
        }
        return instance;
    }

    public static SingletonTyontekija getInstance(){
        return instance;
    }

    public Tyontekija getTyontekija(){
        return tyontekija;
    }


}
