package com.unicuritiba.a01_escola_pi.tela_responsavel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.unicuritiba.a01_escola_pi.R;

public class TelaResponsavel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_responsavel);
    }

    public void avisarescola(View view){
        Toast.makeText(getApplicationContext(),"A ESCOLA FOI AVISADA.",Toast.LENGTH_LONG).show();
    }


}
