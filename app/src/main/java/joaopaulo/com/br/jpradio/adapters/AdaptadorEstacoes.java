package joaopaulo.com.br.jpradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.activities.MainActivity;
import joaopaulo.com.br.jpradio.holders.HolderEstacoesView;
import joaopaulo.com.br.jpradio.model.Estacao;

/**
 * Created by minerthal on 12/04/17.
 */

public class AdaptadorEstacoes extends RecyclerView.Adapter<HolderEstacoesView>{

    private ArrayList<Estacao> estacoes;

    public AdaptadorEstacoes(ArrayList<Estacao> estacoes) {
        this.estacoes = estacoes;
    }

    @Override
    public HolderEstacoesView onCreateViewHolder(ViewGroup parent, int viewType) {

        View card_estaccao = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_estacao, parent,false);

        return new HolderEstacoesView(card_estaccao);
    }



    @Override
    public void onBindViewHolder(HolderEstacoesView holder, final int position) {

        final Estacao estacao = estacoes.get(position);
        holder.updateViewUI(estacao);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getMainActivity().carregarTelaDeDetalhes(estacao);
            }
        });


    }

    @Override
    public int getItemCount() {
        return estacoes.size();
    }
}
