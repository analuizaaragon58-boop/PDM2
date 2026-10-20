package com.example.projetopdmii;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Tela03 extends AppCompatActivity implements View.OnClickListener {
    private ViewPager2 viewPager;
    private ArrayList<Slide> lista;
    private Button btn;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela03);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Linear3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.idDrawer3);
        navigationView = findViewById(R.id.nv3);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.idhome){
                    drawerLayout.closeDrawers();
                    startActivity(new Intent(Tela03.this, TelaHome.class));
                    return true;

                }
                if (menuItem.getItemId() == R.id.idtela02){
                    drawerLayout.closeDrawers();
                    startActivity(new Intent(Tela03 .this, Tela02.class));
                    return true;


                }
                if (menuItem.getItemId() == R.id.idtela03){
                    drawerLayout.closeDrawers();
                    return true;
                }
                return false;
            }
        });

        btn = findViewById(R.id.button6);
        btn.setOnClickListener(this);
        viewPager = findViewById(R.id.viewpager);
        lista = new ArrayList<Slide>();
        lista.add(new Slide("Duquesa", R.drawable.duquesa, "Duquesa é uma cantora e compositora brasileira que se destaca no rap nacional. Sua música mistura rap, trap e R&B, trazendo batidas marcantes e letras que falam principalmente sobre amor, relacionamentos, autoestima e experiências pessoais**" + "\n" +
                "Suas músicas têm uma identidade forte e moderna, destacando sua voz e sua forma de falar sobre sentimentos e situações do cotidiano."));
        lista.add(new Slide("Tasha & Tracie", R.drawable.tashatracie, "Tasha & Tracie são irmãs gêmeas brasileiras que se destacam no rap e no hip-hop. Vindas de São Paulo, elas misturam música, moda e cultura urbana. " +
                "Em suas músicas, abordam temas como identidade, autoestima, representatividade e experiências da periferia, conquistando espaço na cena musical brasileira."));
        lista.add(new Slide("MC Luanna", R.drawable.luanna, "MC Luana é uma cantora brasileira que se destaca no funk. Com seu estilo marcante e suas músicas envolventes, ela conquistou espaço na cena musical. " +
                "Seu trabalho valoriza a cultura do funk e aborda temas do cotidiano, relacionamentos e experiências pessoais."));
        lista.add(new Slide("Julia Costa", R.drawable.juliac, "Júlia Costa é uma cantora e artista brasileira que vem ganhando destaque por seu talento e estilo marcante." +
                " Seu trabalho mistura música e personalidade, conquistando cada vez mais espaço e reconhecimento entre o público jovem."));
        lista.add(new Slide("Summer Walker", R.drawable.summer, "Summer Walker é uma cantora e compositora americana de R&B. " +
                "Conhecida por sua voz marcante e músicas emocionais, ela aborda temas como amor, relacionamentos e sentimentos pessoais, conquistando fãs ao redor do mundo."));
        SlideAdapter adapter = new SlideAdapter(lista);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == btn) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}