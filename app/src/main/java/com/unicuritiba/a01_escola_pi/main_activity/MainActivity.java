package com.unicuritiba.a01_escola_pi.main_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.unicuritiba.a01_escola_pi.R;
import com.unicuritiba.a01_escola_pi.TelaCadastro;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editCPF;
    private TextInputEditText editSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editCPF = findViewById(R.id.txtInputCPF);
        editSenha = findViewById(R.id.txtnputSenha);
        btnLogin = findViewById(R.id.btnEntrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Class classeResponsalvel = TelaCadastro.class;
/*
                if (editCPF.getText().toString().isEmpty() && editSenha.getText().toString().isEmpty()) {
                    classeResponsalvel = TelaEscola.class;
                } else if (editCPF.getText().toString() != null && editSenha.getText().toString() != null ) {
                    classeResponsalvel = TelaCadastro.class;
                }   //else if (editCPF.getText().toString().isEmpty() || editSenha.getText().toString().isEmpty()){
                    //classeResponsalvel = TelaResponsavel.class;}
*/

                Intent intent = new Intent(getApplicationContext(), classeResponsalvel);
                //Passar dados
                startActivity(intent);
            }
        });
    }
}
