package com.example.apoorvagiri.soundcast;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class PlayerActivity extends Activity {
    private Button btnMusic, btnMusic1, btnMusic2, btnMusic3, btnMusic4, btn6;
    MediaPlayer mySong,mySong1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
       // setContentView(R.layout.activity_player1);
        //setContentView(R.layout.activity_player2);
        //setContentView(R.layout.activity_player3);
        //setContentView(R.layout.activity_player4);
       // img1 = (ImageView) findViewById(R.id.img1);
        btnMusic = (Button) findViewById(R.id.btnMusic);
       btn6 = (Button) findViewById(R.id.btn6);

       btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent i = new Intent(PlayerActivity.this, MainActivity.class);
              startActivity(i);
              // MediaPlayer mediaPlayer=MediaPlayer.create(PlayerActivity.this,R.raw.music);
             //  mediaPlayer.start();
            }

        });
        mySong = MediaPlayer.create(PlayerActivity.this, R.raw.tum);
        mySong1=MediaPlayer.create(PlayerActivity.this,R.raw.pehla);
    }
       /* ourSong=MediaPlayer.create(PlayerActivity.class,R.raw.);
        ourSong.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent("com.example.apoorvagiri.soundcast;");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();

*/
        /*  img1.setOnClickListener(new View.OnClickListener() {

            String url="http://docs.google.com/uc?export=download&id=1W6qSax2nUVx9KEFBRU8IDK2xbxyHi9Ms";
            MediaPlayer mediaPlayer=new MediaPlayer();
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare();
            mediaPlayer.start();
           });*/
      /*  img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mediaPlayer = new MediaPlayer();
                String file_path = "http://docs.google.com/uc?export=download&id=1W6qSax2nUVx9KEFBRU8IDK2xbxyHi9Ms";
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mediaPlayer.setDataSource(file_path);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                    btnMusic.setEnabled(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        btnMusic.setEnabled(true);
                        mp.release();
                        mp =null;

                    }});
            }

            });

*//*}
      @Override
              protected void onPause()
        {
            super.onPause();
            ourSong.release();
            finish();
        }
*/

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
        mySong1.release();

    }

}


