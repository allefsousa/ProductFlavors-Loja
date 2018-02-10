package br.com.allefdeveloper.lojaonline.masculina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.allefdeveloper.lojaonline.R;

public class CatalogoMasculinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_masculino);
        getSupportActionBar().setTitle(R.string.too);
    }
}
