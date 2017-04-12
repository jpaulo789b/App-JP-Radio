package joaopaulo.com.br.jpradio.model;

/**
 * Created by minerthal on 12/04/17.
 */

public class Estacao {
    final String DRAWABLE = "drawable/";
    private String titulo;
    private String imgURI;

    public Estacao(String titulo, String imgURI) {
        this.titulo = titulo;
        this.imgURI = imgURI;
    }

    public String getDRAWABLE() {
        return DRAWABLE;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getImgURI() {
        return DRAWABLE + imgURI;
    }

}
