package actividadcuatro;

import java.io.Serializable;

public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Mesa [color=" + color + ", número de patas=" + numeroPatas + "]";
    }

}
