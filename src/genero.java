import java.sql.SQLOutput;

public class genero {
    String tipo;
    String ritmo;
    int anio;
    String pais;
    String artista;

    public genero(String tipo, String ritmo, int anio, String pais, String artista, String festival) {
        this.tipo = tipo;
        this.ritmo = ritmo;
        this.anio = anio;
        this.pais = pais;
        this.artista = artista;
        this.festival = festival;
    }

    //clic derechop general y elegir geter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }
    public void imprimirDatos(){
        // hola a todos
        System.out.println("IMPRIMIR DATOS ");
        System.out.println(this.tipo);
        System.out.println(this.ritmo);
        System.out.println(this.anio);
        System.out.println(this.pais);
        System.out.println(this.artista);
        System.out.println(this.festival);

    }

    String festival;


}
