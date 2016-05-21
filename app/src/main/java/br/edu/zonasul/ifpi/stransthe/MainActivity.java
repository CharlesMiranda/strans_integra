package br.edu.zonasul.ifpi.stransthe;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView btnLocalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inicializarElementos();
    }
    
    private void inicializarElementos(){
        btnLocalizar = (ImageView) findViewById(R.id.btnLocalizar);
        btnLocalizar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLocalizar:
                startActivity(new Intent(MainActivity.this, Localizar.class));
                break;
        }
    }
}
