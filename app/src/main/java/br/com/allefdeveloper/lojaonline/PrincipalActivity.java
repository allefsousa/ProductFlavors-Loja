package br.com.allefdeveloper.lojaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.shimmer.ShimmerFrameLayout;

import br.com.allefdeveloper.lojaonline.masculina.CatalogoMasculinoActivity;

public class PrincipalActivity extends AppCompatActivity {
    Button abrir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        abrir = findViewById(R.id.btnopenloja);
        abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, CatalogoMasculinoActivity.class));
            }
        });

    }
}
