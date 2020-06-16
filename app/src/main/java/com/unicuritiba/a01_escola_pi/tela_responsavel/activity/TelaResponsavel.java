package com.unicuritiba.a01_escola_pi.tela_responsavel.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.unicuritiba.a01_escola_pi.R;

public class TelaResponsavel extends AppCompatActivity {

    int tempoPrevisto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_responsavel);

    }

    public void subirTempo(View view) {
        tempoTotal(true);
    }

    public void diminuirTempo(View view) {
        tempoTotal(false);
    }

    public void tempoTotal(boolean somaDiminue) {
        if (somaDiminue == true){
            tempoPrevisto +=5;
        }else if (tempoPrevisto >= 5){
            tempoPrevisto -=5;
        }

        TextView resultadoTempo = findViewById(R.id.resultadoTempoTela);
        resultadoTempo.setText(""+tempoPrevisto);


    }


    public void avisarEscola(View view) {
        Toast.makeText(getApplicationContext(), "Chegará em " + tempoPrevisto + " minutos", Toast.LENGTH_LONG).show();
    }


}
