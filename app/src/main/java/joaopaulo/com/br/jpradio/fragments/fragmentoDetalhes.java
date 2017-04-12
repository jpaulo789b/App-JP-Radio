package joaopaulo.com.br.jpradio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.model.Estacao;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentoDetalhes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentoDetalhes extends Fragment {
    private final static String ESTACAO_TITULO = "TITULO";
    private final static String ESTACAO_IMG = "IMG";

    private Estacao estacao;
    public fragmentoDetalhes() {
        // Required empty public constructor
    }

    public static fragmentoDetalhes newInstance(Estacao estacao) {
        fragmentoDetalhes fragment = new fragmentoDetalhes();
        Bundle args = new Bundle();
        args.putString(ESTACAO_TITULO, estacao.getTitulo());
        args.putString(ESTACAO_IMG, estacao.getImgURI());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String titulo = getArguments().get(ESTACAO_TITULO).toString();
            String img = getArguments().get(ESTACAO_IMG).toString();
           estacao = new Estacao(titulo,img);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalhes, container, false);
        TextView titulo = (TextView) view.findViewById(R.id.textNomeDaEstacao);
        titulo.setText(estacao.getTitulo());
        ImageView img = (ImageView) view.findViewById(R.id.imageViewEstacao);
        int resorceIMG = img.getResources().getIdentifier(estacao.getImgURI(),null,img.getContext().getPackageName());
        img.setImageResource(resorceIMG);
        return view;
    }

}
