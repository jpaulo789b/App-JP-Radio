package joaopaulo.com.br.jpradio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joaopaulo.com.br.jpradio.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoPrincipal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoPrincipal extends Fragment {


    public FragmentoPrincipal() {
        // Required empty public constructor
    }

    public static FragmentoPrincipal newInstance() {
        FragmentoPrincipal fragment = new FragmentoPrincipal();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento_principal, container, false);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        FragmentoEstacoes fragmentoEstacoesA = FragmentoEstacoes.newInstance(FragmentoEstacoes.ESTACOES_TOP);
        fragmentManager.beginTransaction().add(R.id.conteudo_top,fragmentoEstacoesA).commit();

        FragmentoEstacoes fragmentoEstacoesB = FragmentoEstacoes.newInstance(FragmentoEstacoes.ESTACOES_MID);
        fragmentManager.beginTransaction().add(R.id.conteudo_mid,fragmentoEstacoesB).commit();

        FragmentoEstacoes fragmentoEstacoesC = FragmentoEstacoes.newInstance(FragmentoEstacoes.ESTACOES_BOT);
        fragmentManager.beginTransaction().add(R.id.conteudo_botton,fragmentoEstacoesC).commit();


        return view;
    }

}
