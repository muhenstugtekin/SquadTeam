package com.example.squadteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageCountry = findViewById(R.id.imageCountry);
        TextView nameLiga = findViewById(R.id.nameLiga);
        TextView listViewTeam = findViewById(R.id.listViewTeam);

        Intent intent = getIntent();
        Liga selectedLiga = (Liga) intent.getSerializableExtra("selectedLiga");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), selectedLiga.getPictureInteger());
        imageCountry.setImageBitmap(bitmap);

        nameLiga.setText(selectedLiga.getName());
        listViewTeam.setText(selectedLiga.getTeamList());
    }
}