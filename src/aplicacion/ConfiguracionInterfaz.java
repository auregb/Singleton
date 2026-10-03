package aplicacion;

public class ConfiguracionInterfaz {
    private static ConfiguracionInterfaz instancia;
    private String idioma = "ES";
    private int tamanyoFuente = 16;

    private ConfiguracionInterfaz(){}

    public static ConfiguracionInterfaz getInstancia(){
        if(instancia==null)
            instancia = new ConfiguracionInterfaz();
        return instancia;
    }

    public String getIdioma(){
        return idioma;
    }

    public int getTamanyoFuente(){
        return tamanyoFuente;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public void setTamanyoFuente(int tamanyoFuente){
        this.tamanyoFuente = tamanyoFuente;
    }
}
