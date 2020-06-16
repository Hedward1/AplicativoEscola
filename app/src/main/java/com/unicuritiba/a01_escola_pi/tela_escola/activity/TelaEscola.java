package com.unicuritiba.a01_escola_pi.tela_escola.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unicuritiba.a01_escola_pi.R;
import com.unicuritiba.a01_escola_pi.tela_escola.adapter.AdapterEscola;
import com.unicuritiba.a01_escola_pi.tela_escola.model.Responsavel;

import java.util.ArrayList;
import java.util.List;

public class TelaEscola extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Responsavel> listaResponsaveis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escola);

        recyclerView = findViewById(R.id.recyclerPais);

        //Configurar filmes
        this.criarResponsaveis();

        //Configurar adapter
        AdapterEscola adapterEscola = new AdapterEscola( listaResponsaveis );

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterEscola);

    }


    /*Teoricamente isso aqui consulta a API dos pais*/
    public void criarResponsaveis (){

        Responsavel responsavel = new Responsavel("Hedward","5","hedward junior","5ª A");
        this.listaResponsaveis.add(responsavel);

        responsavel = new Responsavel("marlon", "10", "marlon junior", "5ª A");
        this.listaResponsaveis.add(responsavel);

        responsavel = new Responsavel(" lucas", "Atraso", "lucas junior", "5ª A");
        this.listaResponsaveis.add(responsavel);

    }

}
