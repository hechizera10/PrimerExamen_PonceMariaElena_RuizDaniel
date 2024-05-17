import dao.BD;
import model.Odontologo;
import org.apache.log4j.Logger;
import service.OdontologoService;

import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Cliente.class);
        BD.crearTablas();

        logger.info("Guardando un odontologo en H2");
        Odontologo odontologo1 = new Odontologo( 4,"Juan", "Perez", 12345678);
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.guardarOdontologo(odontologo1);


        logger.info("Iniciando Buscar Todos en H2");
        odontologoService.buscarTodos();


        logger.info("Iniciando Guardado en Lista");

        Odontologo odontologo2 = new Odontologo( 5,"Maria", "Gomez", 87654321);
        Odontologo odontologo3 = new Odontologo( 6,"Pedro", "Gonzalez", 12348765);
        Odontologo odontologo4 = new Odontologo( 7,"Lucia", "Fernandez", 56781234);
        odontologoService.guardarOdontologoEnLista(odontologo2);
        odontologoService.guardarOdontologoEnLista(odontologo3);
        odontologoService.guardarOdontologoEnLista(odontologo4);

        logger.info("Iniciando busqueda en Lista");
        odontologoService.buscarTodosEnLista();

    }
}