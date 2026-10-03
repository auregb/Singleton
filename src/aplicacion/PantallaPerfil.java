package aplicacion;

public class PantallaPerfil {
    public void mostrar(){
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();
        System.out.println("Configuracion Pantalla Perfil. Idioma: " + configuracion.getIdioma() + ", Tamaño fuente: " + configuracion.getTamanyoFuente());
    }
}
