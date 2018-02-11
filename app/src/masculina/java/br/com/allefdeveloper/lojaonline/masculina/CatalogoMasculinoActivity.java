package br.com.allefdeveloper.lojaonline.masculina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.allefdeveloper.lojaonline.Adapter.ProdutosAdapter;
import br.com.allefdeveloper.lojaonline.Model.ProdutosCatalogo;
import br.com.allefdeveloper.lojaonline.R;

public class CatalogoMasculinoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ProdutosCatalogo> catalogos;
    ProdutosCatalogo produto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_masculino);
        getSupportActionBar().setTitle(R.string.too);
        produto = new ProdutosCatalogo();
        catalogos = new ArrayList<>();
        produto.setId(0);
        produto.setPreco(45.00);
        produto.setTitulo("Camisa Futebol");
        produto.setUrlImagens("http://www.camisolasdefutebol.com/images/images/Weigl-Home-Camisa-Futebol-Borussia-Dortmund-2016-2017.jpg");
        catalogos.add(produto);
        produto = new ProdutosCatalogo();
        produto.setId(01);
        produto.setPreco(100.00);
        produto.setTitulo("Camisa Franca Basquete");
        produto.setUrlImagens("https://loja.francabasquete.com.br/894-thickbox_default/regata-oficial-preta-adulto-franca-basquete-camp-paulista-1718-infantil.jpg");
        catalogos.add(produto);
        produto = new ProdutosCatalogo();
        produto.setId(01);
        produto.setPreco(100.00);
        produto.setTitulo("Camisa Franca Basquete");
        produto.setUrlImagens("https://loja.francabasquete.com.br/894-thickbox_default/regata-oficial-preta-adulto-franca-basquete-camp-paulista-1718-infantil.jpg");
        catalogos.add(produto);
//        ShimmerFrameLayout container =
//                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
//        container.startShimmerAnimation();
        recyclerView = (RecyclerView)findViewById(R.id.recyclclerprod);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ProdutosAdapter prodAdapter = new ProdutosAdapter(catalogos,CatalogoMasculinoActivity.this);
        prodAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(prodAdapter);



    }
}
