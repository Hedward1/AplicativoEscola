package com.unicuritiba.a01_escola_pi.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unicuritiba.a01_escola_pi.R;
import com.unicuritiba.a01_escola_pi.tela_escola.activity.TelaEscola;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnLogin = findViewById(R.id.btnEntrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), TelaEscola.class);

                //Passar dados


                startActivity(intent);

            }
        });
    }
}
