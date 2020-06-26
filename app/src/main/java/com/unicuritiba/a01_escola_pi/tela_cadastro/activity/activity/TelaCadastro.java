package com.unicuritiba.a01_escola_pi.tela_cadastro.activity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.unicuritiba.a01_escola_pi.R;

public class TelaCadastro extends AppCompatActivity {

    // Linear Layout Views
    View layoutResponsavel;
    View layoutDependente;
    View layoutFuncionario;


    //radio group
    private RadioGroup tipoDoCadastro;

    //campos de input text


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //Linear Layout
        layoutResponsavel = findViewById(R.id.linearLayoutResponsavel);
        layoutDependente = findViewById(R.id.linearLayoutDependente);
        layoutFuncionario = findViewById(R.id.linearLayoutFuncionario);

        //iniciar sem visibisidade
        layoutResponsavel.setVisibility(View.VISIBLE);
        layoutDependente.setVisibility(View.GONE);
        layoutFuncionario.setVisibility(View.GONE);

        // Radio group
        tipoDoCadastro = findViewById(R.id.cadRadioGroup);

        radioButton();
    }

    private void radioButton() {

        tipoDoCadastro.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.cadRadioResponsavel) {

                    layoutResponsavel.setVisibility(View.VISIBLE);

                    //desabilita a view dos outros
                    layoutDependente.setVisibility(View.GONE);
                    layoutFuncionario.setVisibility(View.GONE);

                } else if (checkedId == R.id.cadRadioDependente) {

                    layoutDependente.setVisibility(View.VISIBLE);

                    //desabilita a view dos outros
                    layoutResponsavel.setVisibility(View.GONE);
                    layoutFuncionario.setVisibility(View.GONE);
                } else if (checkedId == R.id.cadRadioFuncionário) {

                    layoutFuncionario.setVisibility(View.VISIBLE);

                    //desabilita a view dos outros
                    layoutResponsavel.setVisibility(View.GONE);
                    layoutDependente.setVisibility(View.GONE);
                }


            }
        });
    }

}