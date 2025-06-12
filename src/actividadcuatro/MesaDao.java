package actividadcuatro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MesaDao {

    private String fichero = "actividad4_mesas.dat";

    public void guardarMesa(Mesa mesa) {
        List<Mesa> mesas = obtenerMesas();
        mesas.add(mesa);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(mesas);
        } catch (IOException e) {
            System.err.println("Error guardando mesas: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Mesa> obtenerMesas() {
        File file = new File(fichero);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            return (List<Mesa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error leyendo mesas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
