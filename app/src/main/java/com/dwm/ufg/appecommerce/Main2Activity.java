package com.dwm.ufg.appecommerce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //TextView textViewDesc = (TextView) findViewById(R.id.idNomeItem2);
        TextView textViewDetail = (TextView) findViewById(R.id.textView4);
        ImageView imgView = (ImageView) findViewById(R.id.imageView4);

        Produto produto = (Produto) getIntent().getSerializableExtra("produto");

        //textViewDesc.setText(produto.getDescricao());
        textViewDetail.setText(produto.getDetalhesProduto());
        imgView.setImageResource(produto.getImagem());
    }
}
