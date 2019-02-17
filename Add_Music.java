package com.example.apoorvagiri.soundcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Add_Music extends Activity {
    private TextView text, text1, text2, text3;
    private EditText edt1;
    private Button bt1,bt2,bt3,btnMusic5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_music);

        text = (TextView) findViewById(R.id.tw1);
        text1 = (TextView) findViewById(R.id.tw2);
        text2 = (TextView) findViewById(R.id.textView1);
        text3 = (TextView) findViewById(R.id.textView2);
        edt1= (EditText) findViewById(R.id.editText);
        bt1=(Button)findViewById(R.id.select1);
        bt2=(Button)findViewById(R.id.select2);
        bt3=(Button)findViewById(R.id.select3);

        btnMusic5=(Button)findViewById(R.id.btnMusic5);
        bt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Add_Music.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
