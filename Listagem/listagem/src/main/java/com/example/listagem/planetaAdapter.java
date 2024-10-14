package com.example.listagem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class planetaAdapter extends ArrayAdapter<Planeta> {

    Context mContext;
    int mResourceXML;
    List<Planeta> planetas;

    public planetaAdapter(Context context, int resource, List<Planeta> objects){
        super(context, resource, objects);
        mContext=context;
        mResourceXML=resource;
        planetas=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        super.getView(position, convertView, parent);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(mResourceXML, parent, false);
        TextView tvnomeplaneta=v.findViewById(R.id.textView);
        ImageView imageView = v.findViewById(R.id.imageView);
        Planeta planeta = planetas.get(position);
        tvnomeplaneta.setText(planeta.nome);
        imageView.setImageResource(planeta.imagem);

        return v;
    }
}
