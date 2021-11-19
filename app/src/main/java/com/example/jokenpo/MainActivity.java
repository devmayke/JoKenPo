package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pedra(View view){
        this.selecionarOpcao("pedra");
    }
    public void papel(View view){
        this.selecionarOpcao("papel");
    }
    public void tesoura(View view){
        this.selecionarOpcao("tesoura");
    }

    public void selecionarOpcao(String value){
        int opcaoApp = new Random().nextInt(3) + 1;
        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView resultado = findViewById(R.id.resultado);
        ImageView voce = findViewById(R.id.voce);
        TextView textoApp = findViewById(R.id.textoApp);
        TextView textoVoce = findViewById(R.id.textoVoce);

        if(value == "pedra"){
            voce.setImageResource(R.drawable.pedra);
            textoVoce.setText("Pedra");
        } else if(value == "papel" ){
            voce.setImageResource(R.drawable.papel);
            textoVoce.setText("Papel");
        }else{
            voce.setImageResource(R.drawable.tesoura);
            textoVoce.setText("Tesoura");
        }

        switch (opcaoApp){
            case 1:
                textoApp.setText("Pedra");
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case 2:
                textoApp.setText("Papel");
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case 3:
                textoApp.setText("tesoura");
                imagemResultado.setImageResource(R.drawable.tesoura);
        }

        if(value == "pedra" && opcaoApp == 1 || value == "papel" && opcaoApp == 2 || value == "tesoura" && opcaoApp == 3){
            resultado.setText("Empate!");
        } else if(value == "pedra" && opcaoApp == 3 || value == "tesoura" && opcaoApp == 2 || value == "papel" && opcaoApp == 1 ){
            resultado.setTextColor(Color.parseColor("#B43B8C3E"));
            resultado.setText("Você ganhou!");
        } else{
            resultado.setTextColor(Color.parseColor("#9FBF1717"));
            resultado.setText("Você perdeu!");
        }
    }
}