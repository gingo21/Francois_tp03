package fr.utt.if26.francois_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**Méthode on create
    @param Instance si jamais ça plante on repart à l'activité préc
     édente
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText("Message modifie");
        String message = "Bonjour IF26 !";

        //boutton
        Button bt = (Button) findViewById(R.id.bouton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            }
        });

        // accèder à une ressource
        //String messageRessources = getResources().getString(R.id.textview.text);
        //messageRessources = messageRessources.replace("Message modifie", message);
        //tx.setText(messageRessources);
    }
}
