package joaopaulo.com.br.jpradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.fragments.FragmentoPrincipal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentoPrincipal fragmentoPrincipal = (FragmentoPrincipal) fragmentManager.findFragmentById(R.id.fragmento_principal);

        if (fragmentoPrincipal == null){
            fragmentoPrincipal = FragmentoPrincipal.newInstance();
            fragmentManager.beginTransaction().add(R.id.fragmento_principal,fragmentoPrincipal).commit();
        }
    }
}
