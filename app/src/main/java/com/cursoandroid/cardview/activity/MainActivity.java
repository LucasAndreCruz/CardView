package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager( this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        // Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Lucas André", "#tbt Viagem Legal", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel JM", "Viaje, aproveite nossos descontos", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Luiza", "#Paris!!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo", "Que foto linda!", R.drawable.imagem4);
        this.postagens.add(p);
    }


}
