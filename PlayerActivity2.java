package com.example.apoorvagiri.soundcast;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity2 extends Activity {
    Button btnMusic2,btn6;
    MediaPlayer mySong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);
        btnMusic2 = (Button) findViewById(R.id.btnMusic2);
        btn6=(Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayerActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
        mySong = MediaPlayer.create(PlayerActivity2.this, R.raw.kaun);

    }
    public void playIT(View v){
        mySong.start();
    }
    public void playIT1(View v){
        mySong.pause();
    }
    public void playIT2(View v){
        mySong.stop();
    }


    @Override
    protected  void onPause()
    {
        super.onPause();
        mySong.release();
    }

}
