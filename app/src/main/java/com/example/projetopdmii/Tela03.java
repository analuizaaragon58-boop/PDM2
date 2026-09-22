package com.example.projetopdmii;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class Tela03 extends AppCompatActivity {
    private ViewPager2 viewPager;
    private ArrayList<Slide> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela03);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        viewPager = findViewById(R.id.viewpager);
        lista = new ArrayList<Slide>();
        lista.add(new Slide("Duquesa",R.drawable.duquesa,"Duquesa é uma cantora e compositora brasileira que se destaca no rap nacional. Sua música mistura rap, trap e R&B, trazendo batidas marcantes e letras que falam principalmente sobre amor, relacionamentos, autoestima e experiências pessoais**.\n" + "\n" +
                "Suas músicas têm uma identidade forte e moderna, destacando sua voz e sua forma de falar sobre sentimentos e situações do cotidiano.\n"));
        lista.add(new Slide("Tasha & Tracie",R.drawable.tashatracie,"text02"));
        lista.add(new Slide("MC Luanna",R.drawable.luanna,"texto3"));
        lista.add(new Slide("Julia Costa",R.drawable.juliac,"texto4"));
        lista.add(new Slide("Summer Walker",R.drawable.summer,"texto5"));
        SlideAdapter adapter = new SlideAdapter(lista);
        viewPager.setAdapter(adapter);
    }
}