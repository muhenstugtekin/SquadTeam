package com.example.squadteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        //added teams
        Liga argentina = new Liga("Primera Division-A -Argentina-", "Racing Club\nRiver Plate\nLanus\nIndependiente\nBoca Juniors\nEstudiantes\nTigre\nSan Lorenzo\nSarandi\nBelgrano\nVelez Sarsfield\nNewells Old Boys\nRosario Central\nGodoy Cruz\nClub Atletico Banfield\nAtletico Rafaela\nGimnasia La Plata\nDefansa y Justicia\nOlimpo\nQuilmes", R.drawable.argentina);
        Liga brazil = new Liga("Brazil Serie A -Brazil-", "Atletico Goianiense\nAtletico Minerio\nAtletico Paranaense\nBahia\nBotafogo FR\nCeara SC\nCorinthians\nCoritiba\nFlamengo\nFlumiense\nFortaleza\nGoias\nGremio\nInternacional\nPalmerias\nRB Bragantino\nSantos\nSao Paulo\nSport Recife\nVasco da Gama", R.drawable.brazil);
        Liga england = new Liga("Premier League -England-", "Arsenal\nAston Villa\nBournemouth\nBrighton&Hove Albion\nBurnley\nChelsea\nCrystal Palace\nEverton\nLeicester City\nLiverpool\nManchester City\nManchester United\nNewcastle United\nNorwich\nSheffield United\nSouthampton\nSwansea City\nTottenham Hostpur\nWatford\nWest Ham United\nWolverhampton", R.drawable.england);
        Liga france = new Liga("Ligue-1 -France-", "Amiens SC\nAngers\nBordeaux\nDijon\nLille OSC\nMarseille\nMetz\nMonaco\nMontpellier\nNantes\nNice\nNimes Olympique\nO.Lyon\nParis SG\nReims\nRennes\nSt.Etienne\nStade Brest 29\nStrasbourg\nToulouse", R.drawable.france);
        Liga germany = new Liga("Bundesliga -Germany-", "Augsburg\nBayer Leverkusen\nBayern Munih\nBorussia Dortmund\nEintracht Frankfurt\nHeidenheim\nKöln\nFortuna Düsseldorf\nFreiburg\nHertha Berlin\nMainz 05\nMonchengladbach\nPaderborn 07\nRB Leipzig\nSchalke 04\nHoffenheim\nUnion Berlin\nWolfsburg\nWerder Bremen", R.drawable.germany);
        Liga italy = new Liga("Serie A -Italy-", "Atalanta\nBologna\nBrescia\nCagliari\nFiorentina\nGenoa\nHellas Verona\nInter\nJuventus\nLazio\nLecce\nMilan\nNapoli\nParma\nRoma\nSampdoria\nSassuolo\nSpal\nTorino\nUdinese", R.drawable.italy);
        Liga netherlands = new Liga("Eredivisie League -Netherlands-", "ADO Den Haag\nAjax\nAZ Alkmaar\nEmmen\nFeyenoord\nFortuna Sittard\nGroningen\nHeerenveen\nHeracles Almelo\nPEC Zwolle\nPSV Eindhoven\nRKC Waalwijk\nSparta Rotterdam\nTwente\nUtrecht\nVitesse\nVVV Venlo\nWilliem", R.drawable.netherlands);
        Liga portugal = new Liga("Primeira League -Portugal-", "Belenenses\nBenfica\nBoavista\nBraga\nDesportivo das Aves\nFamalicao\nGil Vicente\nMaritimo\nMoreirense\nPacos Ferreira\nPortimonense\nPorto\nRio Ave\nSanta Clara\nSporting Lizbon\nTondela\nVitoria Guimaraes\nVitoria Setubal", R.drawable.portugal);
        Liga russia = new Liga("Premier League -Russia-", "Arsenal Tula\nCSKA Moskova\nDinamo Moskova\nKrasnodar\nFK Akhmat Grozny\nGazovik Orenburk\nKrylya Sovietov\nLokomotiv Moskova\nPFC Sochi\nRostov\nRubin Kazan\nSpartak Moskova\nTambov\nUfa\nUral S.O\nZenit", R.drawable.russia);
        Liga spain = new Liga("Laliga -Spain-", "Athletic Bilbao\nAtletico Madrid\nBarcelona\nCelta Vigo\nAlaves\nEibar\nEspanyol\nGetafe\nGranada\nLeganes\nLevante\nMallorca\nOsasuna\nReal Betis\nReal Madrid\nReal Sociedad\nReal Valladolid\nSevilla\nValencia\nVillareal", R.drawable.spain);
        Liga turkey = new Liga("Super League -Turkey-", "Alanyaspor\nBesiktas\nYeni Malatyaspor\nRizespor\nSivasspor\nFenerbahce\nAntalyaspor\nGalatasaray\nGaziantep\nGençlerbirliği\nGöztepe\nKayserispor\nkonyaspor\nKasımpaşa\nBaşakşehir\nAnkaragücü\nTrabzonspor\nDenizlispor", R.drawable.turkey);

        //added arraylist
        final ArrayList<Liga> countryList = new ArrayList<>();
        countryList.add(argentina);
        countryList.add(brazil);
        countryList.add(england);
        countryList.add(france);
        countryList.add(germany);
        countryList.add(italy);
        countryList.add(netherlands);
        countryList.add(portugal);
        countryList.add(russia);
        countryList.add(spain);
        countryList.add(turkey);

        //Adapter
        CustomAdapter customAdapter = new CustomAdapter(countryList, MainActivity.this);
        listView.setAdapter(customAdapter);

        //select listview -country
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("selectedLiga", countryList.get(position));
                startActivity(intent);
            }
        });
    }
}