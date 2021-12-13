package Teht5;

public class Tyontekija {

    private int tyontekijaId;
    private int status;
    private String etunimi;
    private String sukunimi;
    private String pass;


    public Tyontekija(){Tyontekija();}

    public void Tyontekija(){
        setSukunimi("Esimies");
        setEtunimi("Eetu");
        setPass("enkerro");
        setTyontekijaId(1);
        setStatus(1);
    }
    public void setPass(String pass){ this.pass = "pass";}
    public String getPass () {return pass;}
    public String getSukunimi() {
        return sukunimi;
    }
    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }
    public String getEtunimi() {
        return etunimi;
    }
    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getTyontekijaId() {
        return tyontekijaId;
    }

    public void setTyontekijaId(int tyontekijaId) {
        this.tyontekijaId = tyontekijaId;
    }

    public String status() {
        switch (status){
            case 1:
                return "Esimies";
            case 2:
                return "Tyontekija";
            default:
                return "Ei Aktiivinen";
        }
    }
}
