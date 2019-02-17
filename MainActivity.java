package com.example.apoorvagiri.soundcast;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends Activity implements View.OnClickListener {
   private Button btnMusic,btnMusic1,btnMusic2,btnMusic3,btnMusic4,btnMusic5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Music Library");

        initUI();
        setListener();
    }
        private void initUI() {
            btnMusic = (Button) findViewById(R.id.btnMusic);
            btnMusic1=(Button)findViewById(R.id.btnMusic1);
            btnMusic2=(Button)findViewById(R.id.btnMusic2);
            btnMusic3=(Button)findViewById(R.id. btnMusic3);
            btnMusic4=(Button)findViewById(R.id.btnMusic4);
            btnMusic5=(Button)findViewById(R.id.btnMusic5);
           // img1=(ImageView)findViewById(R.id.img1);

        }
        private void setListener() {
            btnMusic.setOnClickListener(this);
            btnMusic1.setOnClickListener(this);
            btnMusic2.setOnClickListener(this);
            btnMusic3.setOnClickListener(this);
            //btn5.setOnClickListener(this);
            btnMusic4.setOnClickListener(this);

            btnMusic5.setOnClickListener(this);
          //  img1.setOnClickListener(this);


        }

        /*btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
            }
        });
        btnMusic1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
            }
        });
        btnMusic2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
            }
        });
        btnMusic3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
            }
        });
        btnMusic4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
            }
        });
    }*/
         /*btnMusic.setOnClickListener(new View.OnClickListener() {
        mediaPlayer=new MediaPlayer() {
            String file_path="http://docs.google.com/uc?\n" +"export=download&id=1W6qSax2nUVx9KEFBRU8IDK2xbxyHi9Ms";
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            try{

               mediaPlayer.setDataSource(file_path);
                mediaPlayer.prepare();
                mediaPlayer.start();
                btnMusic.setEnabled(false);
            }catch(IOException e){
                e.printStackTrace();
            }
            mediaPlayer.setOnCompletionListener((mp)->

            {
                btnMusic.setEnabled(true);
                mediaPlayer.release();
                mediaPlayer = null;
            } );

        @Override
        public void onClick(View v) {

        }
    });
*/
    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.btnMusic:
                Intent i1 = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i1);
                break;

            case R.id.btnMusic1:
                Intent i2=new Intent (MainActivity.this, PlayerActivity1.class);
                startActivity(i2);
                break;

            case R.id.btnMusic2:
                Intent i3 = new Intent(MainActivity.this,PlayerActivity2.class);
                startActivity(i3);
                break;

            case R.id.btnMusic3:
                Intent i4 = new Intent(MainActivity.this,PlayerActivity3.class);
                startActivity(i4);
                break;

            case R.id.btnMusic4:
                Intent i5 = new Intent(MainActivity.this,PlayerActivity4.class);
                startActivity(i5);
                break;
            case R.id.btnMusic5:
                Intent i6 = new Intent(MainActivity.this,Add_Music.class);
                startActivity(i6);
                finish();
                break;

            default:
                break;
        }
    }

}


