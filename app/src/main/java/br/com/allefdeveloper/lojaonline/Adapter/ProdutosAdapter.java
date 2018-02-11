package br.com.allefdeveloper.lojaonline.Adapter;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.allefdeveloper.lojaonline.R;

/**
 * Created by allef on 11/02/2018.
 */

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ViewHolderProduto> {


    @Override
    public ProdutosAdapter.ViewHolderProduto onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProdutosAdapter.ViewHolderProduto holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderProduto extends RecyclerView.ViewHolder {
        ImageView imagemProduto;
        TextView tituloProduto;
        TextView precoProduto;
        FloatingActionButton adicionarProduto;

        public ViewHolderProduto(View v) {
            super(v);
            imagemProduto = v.findViewById(R.id.thumbnail);
            tituloProduto = v.findViewById(R.id.titulo);
            precoProduto = v.findViewById(R.id.preco);
            adicionarProduto = v.findViewById(R.id.floatingActionButton);

        }
    }
}
