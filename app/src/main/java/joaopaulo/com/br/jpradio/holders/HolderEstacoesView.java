package joaopaulo.com.br.jpradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import joaopaulo.com.br.jpradio.R;
import joaopaulo.com.br.jpradio.model.Estacao;

/**
 * Created by minerthal on 12/04/17.
 */

public class HolderEstacoesView extends RecyclerView.ViewHolder {

    private ImageView main_img;
    private TextView main_text;

    public HolderEstacoesView(View itemView) {
        super(itemView);

        this.main_img = (ImageView) itemView.findViewById(R.id.main_img);
        this.main_text = (TextView) itemView.findViewById(R.id.main_text);


    }

    public void updateViewUI(Estacao estacao){
        String uri = estacao.getImgURI();
        int resorceIMG = main_img.getResources().getIdentifier(uri,null,main_img.getContext().getPackageName());
        main_img.setImageResource(resorceIMG);

        main_text.setText(estacao.getTitulo());
    }


}
