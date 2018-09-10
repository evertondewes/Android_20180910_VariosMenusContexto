package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.tx1);
        TextView t2 = findViewById(R.id.tx2);
        ImageView iw = findViewById(R.id.imageView);


        registerForContextMenu(t1);
        registerForContextMenu(t2);
        registerForContextMenu(iw);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.tx1) {
            getMenuInflater().inflate(R.menu.primeiro_menu, menu);
        } else if (v.getId() == R.id.tx2) {
            getMenuInflater().inflate(R.menu.segundo_menu, menu);
        } else {
            getMenuInflater().inflate(R.menu.opcoes_imagem, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.veiculoAdicionar:
                Toast.makeText(getApplicationContext(),"Adiconar Veiculo", Toast.LENGTH_LONG).show();
                break;
            case R.id.veiculoExcluir:
                Toast.makeText(getApplicationContext(),"Excluir Veiculo", Toast.LENGTH_LONG).show();
                break;
            case R.id.imagemEditar:
                Toast.makeText(getApplicationContext(),"Editar Imagem", Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}
