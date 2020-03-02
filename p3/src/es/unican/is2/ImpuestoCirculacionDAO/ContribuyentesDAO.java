package es.unican.is2.ImpuestoCirculacionDAO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import es.unican.ss.impuestocirculacion.Ayuntamiento;
import es.unican.ss.impuestocirculacion.Contribuyente;
import es.unican.ss.impuestocirculacion.Vehiculo;

/**
 * Interfaz DAO para los veh�culos
 * ¡¡ LOS METODOS QUE NO SE UTILIZAN SE DEJAN RETORNANDO UN NULL !!
 */
public class ContribuyentesDAO implements IContribuyentesDAO {

    /**
     * Persite un nuevo contribuyente
     * 
     * @param c contribuyente a a�adir
     * @return El contribuyente una vez a�adido
     */
    public Contribuyente creaContribuyente(Contribuyente c) {
        return null;
    }

    /**
     * Elimina el veh�culo cuyo dni se pasa como par�metro
     * 
     * @param dni
     * @return El veh�culo eliminado
     */
    public Contribuyente contribuyente(String dni) {
        List<Vehiculo> list = cargaDatos();
        for (Vehiculo vehiculo : list) {
            if (((Contribuyente)vehiculo.getContribuyente()).getDni().equals(dni)) {
                return ((Contribuyente)vehiculo.getContribuyente());
            }
        }
        return null;
    }

    /**
     * Actualiza el estado del contribuyente que se pasa como par�metro
     * 
     * @param nuevo Nuevo estado del contribuyente
     * @return El contribuyente actualizado
     */
    public Contribuyente actualizaContribuyente(Contribuyente nuevo) {
        return null;
    }

    /**
     * Retorna el veh�cula cuyo dni se pasa como par�metro
     * 
     * @param dni
     * @return El contribuyente null si no se encuentra
     */
    public Contribuyente eliminaContribuyente(String dni) {
        return null;
    }

    /**
     * Retorna la lista completa de contribuyentes
     * 
     * @return La lista de contribuyentes Lista vac�a si no hay ninguno
     */
    public List<Contribuyente> contribuyentes() {
        return null;
    }

    /**
     * Metodo que carga los datos del xml y retorna una lista con todos los
     * contribuyentes encontrados
     */
    private ArrayList<Vehiculo> cargaDatos() {
        // leo los datos
        JAXBContext jaxbctx;
        ArrayList<Vehiculo> result = new ArrayList<Vehiculo>(); //creo lista 😎
        try {
            jaxbctx = JAXBContext.newInstance(Ayuntamiento.class);
            Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
            Ayuntamiento ayu = (Ayuntamiento) unmarshaller.unmarshal(new File("src\\main\\resources\\ImpuestoCirculacion.xml"));
            // meto todos en la lista 
            for (Vehiculo v: ayu.getVehiculos()){
                result.add(v);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Vehiculo> listaVehiculosContribuyente(String dni){
        ArrayList<Vehiculo> datos = cargaDatos();
        ArrayList<Vehiculo> result = new ArrayList<Vehiculo>();
        for (Vehiculo v: datos){
            if(((Contribuyente)v.getContribuyente()).getDni().equals(dni)){
                result.add(v);
            }
        }
        return result;
    }
	
}