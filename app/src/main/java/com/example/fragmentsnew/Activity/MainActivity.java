package com.example.fragmentsnew.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentsnew.R;
import com.example.fragmentsnew.fragment.BlankFragment;
import com.example.fragmentsnew.fragment.contatoFragment;

public class MainActivity extends AppCompatActivity {
private Button buttonConversa, buttonContato;
private BlankFragment blankFragment;
private contatoFragment contatoFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // remover sombra
        blankFragment = new BlankFragment();
        buttonContato = findViewById(R.id.button5);
        buttonConversa = findViewById(R.id.button3);
        getSupportActionBar().setElevation(0);
        // confiura objeto parao fgragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo,blankFragment);
        transaction.commit();
        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatoFragment = new contatoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,contatoFragment);
                transaction.commit();
            }
        });
        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatoFragment = new contatoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,blankFragment);
                transaction.commit();
            }
        });

    }
}