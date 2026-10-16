package clases;

public class usuarios {
    private String img;
    private String nombre;
    private  String curso;

    public usuarios(String img, String nombre, String curso) {
        this.img = img;
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
