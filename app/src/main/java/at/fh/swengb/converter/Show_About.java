package at.fh.swengb.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show_About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__about);

        Intent intent = getIntent();
        String message = intent.getStringExtra("resultOfConv");

        TextView textViewMessage   = (TextView) findViewById(R.id.textViewResult);
        textViewMessage.setText("Result: "+message+" Gibibyte");




    }
}
