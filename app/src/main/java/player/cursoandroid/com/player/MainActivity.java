package player.cursoandroid.com.player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button play;
    private Button pause;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.botaoPlayId);
        pause = findViewById(R.id.botaoStopId);
        mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.musica);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tocarMusica();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausaMusica();
            }
        });
    }


    private void tocarMusica(){

            mediaplayer.start();

    }

    private void pausaMusica(){

        mediaplayer.pause();

    }
}
