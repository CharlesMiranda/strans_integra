package br.edu.zonasul.ifpi.stransthe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Avaliacao3 extends AppCompatActivity implements View.OnClickListener{

    private ImageView btnFeliz, btnTantoFaz, btnInFeliz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao3);
        this.inicializarElementos();
    }

    private void inicializarElementos(){
        btnFeliz = (ImageView) findViewById(R.id.btnFeliz);
        btnTantoFaz = (ImageView) findViewById(R.id.btnTantoFaz);
        btnInFeliz = (ImageView) findViewById(R.id.btnInFeliz);

        btnFeliz.setOnClickListener(this);
        btnTantoFaz.setOnClickListener(this);
        btnInFeliz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(Avaliacao3.this, MapsActivity.class));

    }
}
