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
                "https://cdng.europosters.eu/pod_public/1300/268992.jpg",
                "Sung Jin-Woo",
                "Protagonista - Monarca de las Sombras"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/ac/57/5b/ac575bdaa2a759d1d3188011fe932a19.jpg",
                "Cha Hae-In",
                "Cazadora Rango S - Vicecapitana del Gremio Hunters"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/a2/de/54/a2de545074815a8787345753a534cdca.jpg",
                "Yoo Jinho",
                "Cazador Rango D - Vicepresidente del Gremio Ahjin"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/89/a3/96/89a39640e48f4f37e832cfc9f33608c5.jpg",
                "Choi Jong-In",
                "Cazador Rango S - El Mago más fuerte / Líder de Hunters"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/1200x/bc/e9/09/bce909eb66e5b31c2e0a7dbc19ea494b.jpg",
                "Go Gun-Hee",
                "Presidente de la Asociación de Cazadores de Corea"
        ));
        listaUsuarios.add(new usuarios(
                "https://i.pinimg.com/736x/38/d2/9a/38d29a1b538109adbf81493830bf25e7.jpg",
                "Baek Yoonho",
                "Cazador Rango S - Líder del Gremio Tigre Blanco"
        ));

        usuarioadaptador adaptador = new usuarioadaptador(listaUsuarios);
        rcv_usuarios.setAdapter(adaptador);
    }
}
