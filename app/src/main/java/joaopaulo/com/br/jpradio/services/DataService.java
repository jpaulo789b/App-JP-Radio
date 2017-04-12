package joaopaulo.com.br.jpradio.services;

import java.util.ArrayList;

import joaopaulo.com.br.jpradio.model.Estacao;

/**
 * Created by minerthal on 12/04/17.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Estacao> getEstacoesTOP(){
        // Vamos fingir que estamos nos comunicando um banco de dados :)
        ArrayList<Estacao> lista = new ArrayList<>();
        lista.add(new Estacao("Para ouvir no avião","flightplanmusic"));
        lista.add(new Estacao("Para ouvir de bicicleta","flightplanmusic"));
        lista.add(new Estacao("Pagode para você","flightplanmusic"));
        lista.add(new Estacao("Música infantis","flightplanmusic"));
        return lista;
    }
    public ArrayList<Estacao> getEstacoesMID(){
        // Vamos fingir que estamos nos comunicando um banco de dados :)
        ArrayList<Estacao> lista = new ArrayList<>();
        lista.add(new Estacao("Para ouvir no avião","flightplanmusic"));
        lista.add(new Estacao("Para ouvir de bicicleta","flightplanmusic"));
        lista.add(new Estacao("Pagode para você","flightplanmusic"));
        lista.add(new Estacao("Música infantis","flightplanmusic"));
        return lista;
    }
    public ArrayList<Estacao> getEstacoesBOT(){
        // Vamos fingir que estamos nos comunicando um banco de dados :)
        ArrayList<Estacao> lista = new ArrayList<>();
        lista.add(new Estacao("Zéca Pacotinho","flightplanmusic"));
        lista.add(new Estacao("A casa do seu Zé","flightplanmusic"));
        lista.add(new Estacao("Nos vemos por ai","flightplanmusic"));
        lista.add(new Estacao("Sad Boy","flightplanmusic"));
        return lista;
    }
}
