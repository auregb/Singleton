package aplicacion;

public class PantallaInicio {
    public void mostrar(){
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();
        System.out.println("Configuracion Pantalla Inicio. Idioma: " + configuracion.getIdioma() + ", Tamaño fuente: " + configuracion.getTamanyoFuente());
    }
}
