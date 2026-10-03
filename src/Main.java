import aplicacion.*;

public class Main {
    public static void main(String[] args) {
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();
        configuracion.setIdioma("EN");
        configuracion.setTamanyoFuente(20);

        new PantallaInicio().mostrar();
        new PantallaPerfil().mostrar();
    }
}
