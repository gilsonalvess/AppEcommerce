package com.dwm.ufg.appecommerce;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProdutoAdapter extends BaseAdapter {

    private final ArrayList<Produto> produtos;
    private final Activity activity;

    public ProdutoAdapter(ArrayList<Produto> produtos, Activity activity) {
        this.produtos = produtos;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = activity.getLayoutInflater()
                .inflate(R.layout.item_produto, parent, false);

        Produto produto = produtos.get(position);

        TextView nome = (TextView) rowView.findViewById(R.id.idNomeItem);
        TextView descricao = (TextView) rowView.findViewById(R.id.idItemDescricao);
        ImageView img = (ImageView) rowView.findViewById(R.id.idImgProduto);

        nome.setText(produto.getDescricao());
        descricao.setText(produto.getDetalhesProduto());
        img.setImageResource(produto.getImagem());

        return rowView;
    }
}
