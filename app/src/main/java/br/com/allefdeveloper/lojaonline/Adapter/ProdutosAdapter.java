package br.com.allefdeveloper.lojaonline.Adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.List;

import br.com.allefdeveloper.lojaonline.Model.ProdutosCatalogo;
import br.com.allefdeveloper.lojaonline.R;

/**
 * Created by allef on 11/02/2018.
 */

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ViewHolderProduto> {
    List<ProdutosCatalogo> listaProd;
    Context context;
    ShimmerFrameLayout container;

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
            holder.precoProduto.setText("Preço: "+String.valueOf(listaProd.get(position).getPreco()+" R"));
            container.startShimmerAnimation();
            if(listaProd.get(position).getUrlImagens()!=null){
                Glide.with(context).load(listaProd.get(position).getUrlImagens()).diskCacheStrategy(DiskCacheStrategy.RESULT).placeholder(R.drawable.placeholder).into(holder.imagemProduto);
                container.stopShimmerAnimation();
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
        ImageButton adicionarProduto;

        public ViewHolderProduto(View v) {
            super(v);
            imagemProduto = v.findViewById(R.id.thumbnail);
            tituloProduto = v.findViewById(R.id.titulo);
            precoProduto = v.findViewById(R.id.preco);
            adicionarProduto = v.findViewById(R.id.flotbutton);
             container =
                    (ShimmerFrameLayout) v.findViewById(R.id.shimmer_view_container);

        }
    }
}
