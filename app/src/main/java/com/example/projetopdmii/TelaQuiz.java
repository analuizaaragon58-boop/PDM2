package com.example.projetopdmii;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class TelaQuiz extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    private TextView textoAcertos , textoErros, textoPerguntas, perguntas;
    private Button btnVerificar, btnPular;






    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.idDrawer4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        drawerLayout = findViewById(R.id.idDrawer4);
        navigationView = findViewById(R.id.navigationView4);
        toolbar = findViewById(R.id.toolbar4);
        toggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar , R.string.open,R. string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.idhome){
                    drawerLayout.closeDrawers();
                    startActivity(new Intent(TelaQuiz.this, Tela03.class));
                    return false;

                }
                if (menuItem.getItemId() == R.id.idtela02){
                    drawerLayout.closeDrawers();
                    startActivity(new Intent(TelaQuiz.this, Tela03.class));
                    return true;

                }
                if (menuItem.getItemId() == R.id.idtela03){
                    drawerLayout.closeDrawers();


                }
                return false;
            }
        });
        textoAcertos.findViewById(R.id.textView12);
    }
}