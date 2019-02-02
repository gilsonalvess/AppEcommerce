package com.dwm.ufg.appecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Produto> listaDeProdutos = preencheDados();
        ProdutoAdapter adapter = new ProdutoAdapter(listaDeProdutos, this);
        final ListView listView = (ListView) findViewById(R.id.idLista);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(this, Main2Activity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(),"Você clicou em: "+ listaDeProdutos.get(position).getNome(),Toast.LENGTH_SHORT).show();
                intent.putExtra("produto", listaDeProdutos.get(position));

                startActivity(intent);
            }
        });
    }

    private ArrayList<Produto> preencheDados () {

        ArrayList<Produto> listaDeTimes = new ArrayList<Produto>();

        listaDeTimes.add(new Produto(1, "Smart phone 5G", 799.99, R.drawable.smartphone));
        listaDeTimes.add(new Produto(2, "Smart phone 5G", 899.99, R.drawable.smartphone));
        listaDeTimes.add(new Produto(3, "Smart phone 5G", 799.99, R.drawable.smartphone));

        return listaDeTimes;
    }
}
