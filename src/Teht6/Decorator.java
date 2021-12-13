package Teht6;

public abstract class Decorator implements Window{

    protected Window decoratedData;

    public Decorator(Window decoratedData){
        this.decoratedData = decoratedData;
    }

    public Kone getInfo(){
        return decoratedData.getInfo();
    }


}
