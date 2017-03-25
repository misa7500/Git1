package com.example.pc_1.prueba;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titulo;
        titulo=(TextView)findViewById(R.id.titulo);
        titulo.setText("Silver");
        titulo.setTextColor(Color.argb(127,255,255,0));
        titulo.setTextSize(100);

        RelativeLayout home;
        home=(RelativeLayout)findViewById(R.id.home);
        home.setBackgroundColor(Color.rgb(255,0,120));

        //SmsManager mensaje=SmsManager.getDefault();
        //mensaje.sendTextMessage("5513894675",null,"Yupiii",null,null);

        Log.e("super error","oooops D:!! ");

        Toast.makeText(getBaseContext(),"ya paraleeeee", Toast.LENGTH_SHORT).show();





    }
}
