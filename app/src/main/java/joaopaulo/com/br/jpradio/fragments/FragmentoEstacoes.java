package joaopaulo.com.br.jpradio.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.adapters.AdaptadorEstacoes;
import joaopaulo.com.br.jpradio.services.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoEstacoes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoEstacoes extends Fragment {


    public static final String ARGESTACAO = "TIPO_DE_ESTACAO";
    public static final int ESTACOES_TOP = 0;
    public static final int ESTACOES_MID = 1;
    public static final int ESTACOES_BOT = 2;

    private int tipoDeEstacao;


    public FragmentoEstacoes() {
        // Required empty public constructor
    }

    public static FragmentoEstacoes newInstance(int tipoDeEstacao) {
        FragmentoEstacoes fragment = new FragmentoEstacoes();
        Bundle args = new Bundle();
        args.putInt(ARGESTACAO,tipoDeEstacao);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.tipoDeEstacao = getArguments().getInt(ARGESTACAO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_estacoes, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerEstacoes);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.addItemDecoration(new HorizontalDecoracao(30));
        recyclerView.setLayoutManager(linearLayoutManager);



        AdaptadorEstacoes adaptadorEstacoes;
//        = new AdaptadorEstacoes();
        if (tipoDeEstacao == ESTACOES_TOP){
            adaptadorEstacoes = new AdaptadorEstacoes(DataService.getInstance().getEstacoesTOP());
        }else if(tipoDeEstacao == ESTACOES_MID){
            adaptadorEstacoes = new AdaptadorEstacoes(DataService.getInstance().getEstacoesMID());
        }else{
            adaptadorEstacoes = new AdaptadorEstacoes(DataService.getInstance().getEstacoesBOT());
        }
        recyclerView.setAdapter(adaptadorEstacoes);
        return view;
    }

}

class HorizontalDecoracao extends RecyclerView.ItemDecoration{
    public final int ESPACAMENTO;

    public HorizontalDecoracao(int ESPACAMENTO) {
        this.ESPACAMENTO = ESPACAMENTO;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect,view,parent,state);
            outRect.right = ESPACAMENTO;

    }
}