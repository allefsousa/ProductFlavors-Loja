package br.com.allefdeveloper.lojaonline.Adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import br.com.allefdeveloper.lojaonline.Model.ProdutosCatalogo;
import br.com.allefdeveloper.lojaonline.R;

/**
 * Created by allef on 11/02/2018.
 */

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ViewHolderProduto> {
    List<ProdutosCatalogo> listaProd;
    Context context;

    public ProdutosAdapter(List<ProdutosCatalogo> listaProd, Context context) {
        this.listaProd = listaProd;
        this.context = context;
    }

    @Override
    public ProdutosAdapter.ViewHolderProduto onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemproduto_activity,parent,false);
        ViewHolderProduto holderProduto = new ViewHolderProduto(view);
        return holderProduto;
    }

    @Override
    public void onBindViewHolder(ProdutosAdapter.ViewHolderProduto holder, int position) {
        if(!listaProd.isEmpty() && listaProd.size()>0){
            holder.tituloProduto.setText(listaProd.get(position).getTitulo());
            holder.precoProduto.setText(String.valueOf(listaProd.get(position).getPreco()));
            if(!listaProd.get(position).getUrlImagens().isEmpty()){
                Glide.with(context).load(listaProd.get(position).getUrlImagens()).into(holder.imagemProduto);
            }
        }
    }

    @Override
    public int getItemCount() {
        return listaProd.size();
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
