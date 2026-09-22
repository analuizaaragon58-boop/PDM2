package com.example.projetopdmii;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SlideHolder extends RecyclerView.ViewHolder {
    public TextView titulo,texto ;
    public ImageView imagem;

    public SlideHolder(@NonNull View itemView) {
        super(itemView);
        titulo = itemView.findViewById(R.id.textView3);
        texto = itemView.findViewById(R.id.textView5);
        imagem = itemView.findViewById(R.id.imageView);
    }
}

