package com.example.buscawhatsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private EditText ddd;
    private EditText telefone;

    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ddd = findViewById(R.id.campoDDD);
        telefone = findViewById(R.id.campoTelefone);
        status = findViewById(R.id.statustxt);
    }

    public void ligar(View view) {
        String d = ddd.getText().toString();
        String fone = telefone.getText().toString();
        int numeroDeCaracteresFone = fone.length();
        int numeroDeCaracteresDDD = d.length();

        if (numeroDeCaracteresFone > 10) {
            String numfonecomp = fone.substring(numeroDeCaracteresFone - 11, numeroDeCaracteresFone);
            String numfone = numfonecomp.substring(11 - 9, 11);
            String numddd = numfonecomp.substring(0, 2);
            telefone.setText(numfone);
            ddd.setText(numddd);

            status.setText("Número verificado!");
            Uri number = Uri.parse("tel:+55" + d + fone);
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
            }
         else if(numeroDeCaracteresFone == 10) {
                String numfonecomp = fone.substring(numeroDeCaracteresFone - 10, numeroDeCaracteresFone);
                String numfone = numfonecomp.substring(10 - 8, 10);
                String numddd = numfonecomp.substring(0, 2);
                telefone.setText(numfone);
                ddd.setText(numddd);
                status.setText("Número verificado!");
                Uri number = Uri.parse("tel:+55" + d + fone);
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
         }
         else {if(d.equals("") || fone.equals("") || numeroDeCaracteresFone < 8) {
                Toast.makeText(getBaseContext(), "Preencha os campos de DDD e Telefone corretamente!", Toast.LENGTH_LONG).show();
                status.setText("DDD ou Telefone incorretos");
                } else {
                    // Defina o texto
                    status.setText("Número verificado!");
                    Uri number = Uri.parse("tel:+55" + d + fone);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void deletar(View view) {

        telefone.setText("");
        ddd.setText("");
        status.setText("Cole ddd+telefone no campo de telefone.\n Ou digite cada um em seu campo!");
    }

    public void whats(View view){
        String d = ddd.getText().toString();
        String fone = telefone.getText().toString();
        int numeroDeCaracteresFone = fone.length();
        int numeroDeCaracteresDDD = d.length();

        if (numeroDeCaracteresFone > 10) {
            String numfonecomp = fone.substring(numeroDeCaracteresFone - 11, numeroDeCaracteresFone);
            String numfone = numfonecomp.substring(11 - 9, 11);
            String numddd = numfonecomp.substring(0, 2);
            telefone.setText(numfone);
            ddd.setText(numddd);

            status.setText("Número verificado!");
            String url = "http://wa.me/55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        else if(numeroDeCaracteresFone == 10) {
            String numfonecomp = fone.substring(numeroDeCaracteresFone - 10, numeroDeCaracteresFone);
            String numfone = numfonecomp.substring(10 - 8, 10);
            String numddd = numfonecomp.substring(0, 2);
            telefone.setText(numfone);
            ddd.setText(numddd);
            status.setText("Número verificado!");
            String url = "http://wa.me/55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        else {if(d.equals("") || fone.equals("") || numeroDeCaracteresFone < 8) {
            Toast.makeText(getBaseContext(), "Preencha os campos de DDD e Telefone corretamente!", Toast.LENGTH_LONG).show();
            status.setText("DDD ou Telefone incorretos");
        } else {
            // Defina o texto
            status.setText("Número verificado!");
            String url = "http://wa.me/55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        }
    }

    public void telegram(View view){
        String d = ddd.getText().toString();
        String fone = telefone.getText().toString();
        int numeroDeCaracteresFone = fone.length();
        int numeroDeCaracteresDDD = d.length();

        if (numeroDeCaracteresFone > 10) {
            String numfonecomp = fone.substring(numeroDeCaracteresFone - 11, numeroDeCaracteresFone);
            String numfone = numfonecomp.substring(11 - 9, 11);
            String numddd = numfonecomp.substring(0, 2);
            telefone.setText(numfone);
            ddd.setText(numddd);

            status.setText("Número verificado!");
            String url = "https://t.me/+55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        else if(numeroDeCaracteresFone == 10) {
            String numfonecomp = fone.substring(numeroDeCaracteresFone - 10, numeroDeCaracteresFone);
            String numfone = numfonecomp.substring(10 - 8, 10);
            String numddd = numfonecomp.substring(0, 2);
            telefone.setText(numfone);
            ddd.setText(numddd);
            status.setText("Número verificado!");
            String url = "https://t.me/+55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        else {if(d.equals("") || fone.equals("") || numeroDeCaracteresFone < 8) {
            Toast.makeText(getBaseContext(), "Preencha os campos de DDD e Telefone corretamente!", Toast.LENGTH_LONG).show();
            status.setText("DDD ou Telefone incorretos");
        } else {
            // Defina o texto
            status.setText("Número verificado!");
            String url = "https://t.me/+55"+d+fone;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
        }
    }

    public void trocarTelaContato(View view){
        Intent t = new Intent(this, Splash2.class);
        startActivity(t);
    }


}
