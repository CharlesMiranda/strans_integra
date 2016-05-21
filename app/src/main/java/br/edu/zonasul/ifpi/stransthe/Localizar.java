package br.edu.zonasul.ifpi.stransthe;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

public class Localizar extends AppCompatActivity {

    private SearchView lupa_pesquisa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizar);
        this.inicializarElementos();
    }

    private void inicializarElementos(){
        lupa_pesquisa = (SearchView) findViewById(R.id.lupa_pesquisa);
        lupa_pesquisa.onActionViewExpanded();

        lupa_pesquisa.setOnQueryTextListener(getLupaQueryTextListener());
    }

    private SearchView.OnQueryTextListener getLupaQueryTextListener(){

        return new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                // TODO Auto-generated method stub

                startActivity(new Intent(Localizar.this, MapsActivity.class));

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // TODO Auto-generated method stub
                return false;
            }
        };
    }
}
