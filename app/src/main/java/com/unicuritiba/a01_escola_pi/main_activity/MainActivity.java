package com.unicuritiba.a01_escola_pi.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.unicuritiba.a01_escola_pi.R;
import com.unicuritiba.a01_escola_pi.tela_responsavel.activity.TelaResponsavel;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editCPF;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editCPF = findViewById(R.id.txtInputCPF);
        btnLogin = findViewById(R.id.btnEntrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TelaResponsavel.class);

                //Passar dados
                startActivity(intent);
            }
        });
    }
}
