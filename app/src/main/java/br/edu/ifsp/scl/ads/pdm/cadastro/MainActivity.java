package br.edu.ifsp.scl.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Formulario formulario;
    private Button limparBt, enviarBt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviarBt = findViewById(R.id.enviarBt);
        enviarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario = new Formulario();
                formulario.setNomeEt(findViewById(R.id.nomeEt));
                formulario.setTelefoneEt(findViewById(R.id.telefoneEt));
                formulario.setEmailEt(findViewById(R.id.emailEt));
                formulario.setEmailCb(findViewById(R.id.emailCb));
                formulario.setMasculinoRb(findViewById(R.id.masculinoRb));
                formulario.setFemininoRb(findViewById(R.id.feminimoRb));
                formulario.setCidadeEt(findViewById(R.id.cidadeEt));

                Toast.makeText(MainActivity.this, formulario.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        //EMPACADO NESSA PARTE DE COLOCAR DOIS CLICKLISTENERS
       /* findViewById(R.id.limparBt);
        limparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/


    }
}