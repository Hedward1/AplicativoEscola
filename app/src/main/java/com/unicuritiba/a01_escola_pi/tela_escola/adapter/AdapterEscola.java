package com.unicuritiba.a01_escola_pi.tela_escola.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unicuritiba.a01_escola_pi.R;
import com.unicuritiba.a01_escola_pi.tela_escola.model.Responsavel;

import java.util.List;

public class AdapterEscola extends RecyclerView.Adapter<AdapterEscola.MyViewHolder> {

    private List<Responsavel> listaResponsavel;

    public AdapterEscola(List<Responsavel> lista) {
        this.listaResponsavel = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Vai recuperar o primeiro responsavel.
        Responsavel responsavel = listaResponsavel.get( position );

        holder.nomeResponsavel.setText(responsavel.getNomeResponsavel());
        /*Verificar como vai funcionar essa parte com cronometro.*/
        holder.tempoRestante.setText(responsavel.getTempoRestante());
        holder.nomeDependente.setText(responsavel.getNomeDependente());
        holder.periodoDependente.setText(responsavel.getPeriodoDependente());

    }

    @Override
    public int getItemCount() {
        return listaResponsavel.size();
    }



    /*aqui vai consultar a API para mostrar na tela da escola*/

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeResponsavel;
        TextView tempoRestante;
        TextView nomeDependente;
        TextView periodoDependente;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeResponsavel     = itemView.findViewById(R.id.txtNomeResponsavel);
            tempoRestante       = itemView.findViewById(R.id.txtTempoResponsavel);
            nomeDependente      = itemView.findViewById(R.id.txtNomeDependente);
            periodoDependente   = itemView.findViewById(R.id.txtPeriodoDependente);

        }
    }

}
