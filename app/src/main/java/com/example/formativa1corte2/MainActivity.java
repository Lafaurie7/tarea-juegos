package com.example.formativa1corte2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adaptadores.usuarioadaptador;
import clases.usuarios;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);
        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));

        List<usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/f5/ae/9f/f5ae9fffa5e564b5576b9277f9270714.jpg",
                "Link",
                "The Legend of Zelda - Héroe de Hyrule"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/1200x/0e/7d/7b/0e7d7b3723a8d5dfa82361b0f0c0da16.jpg",
                "Master Chief",
                "Halo - SPARTAN-117"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/8b/fe/e6/8bfee6cc8d6c7727a677edeed61fb46f.jpg",
                "Kratos",
                "God of War - Dios de la Guerra"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/1200x/5a/47/dd/5a47ddced4044114df8069a446b9aee4.jpg",
                "Lara Croft",
                "Tomb Raider - Arqueóloga y Exploradora"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/1200x/7c/ea/93/7cea93d3901f8f42a4e69628c8336988.jpg",
                "Geralt de Rivia",
                "The Witcher 3 - El Lobo Blanco"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/1200x/14/43/01/1443013dd13d5a9d7483e42ad9dae720.jpg",
                "Arthur Morgan",
                "Red Dead Redemption 2 - Forajido"
        ));

        usuarioadaptador adaptador = new usuarioadaptador(listaUsuarios);
        rcv_usuarios.setAdapter(adaptador);
    }
}
