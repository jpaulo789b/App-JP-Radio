package joaopaulo.com.br.jpradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.fragments.FragmentoPrincipal;
import joaopaulo.com.br.jpradio.fragments.fragmentoDetalhes;
import joaopaulo.com.br.jpradio.model.Estacao;

public class MainActivity extends AppCompatActivity {
    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMainActivity(this);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentoPrincipal fragmentoPrincipal = (FragmentoPrincipal) fragmentManager.findFragmentById(R.id.fragmento_principal);

        if (fragmentoPrincipal == null){
            fragmentoPrincipal = FragmentoPrincipal.newInstance();
            fragmentManager.beginTransaction().add(R.id.fragmento_principal,fragmentoPrincipal).commit();
        }
    }

    public void carregarTelaDeDetalhes(Estacao estacao){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmento_principal, new fragmentoDetalhes().newInstance(estacao)).addToBackStack("commit").commit();
    }
}
