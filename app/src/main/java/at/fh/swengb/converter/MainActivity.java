package at.fh.swengb.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.inputText);
        resultView = (TextView) findViewById(R.id.resultView);

    }


    public void convert(View view) {

        String num1String = inputText.getText().toString();

        double num1 = 0;
        double num2 = 1.073741824;
        double result = 0;

        try {
            num1 = Double.parseDouble(num1String);

            result = num1 / num2;
            resultView.setText("" + result);

        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT!!!!");
            e.printStackTrace();
        }

    }


    public void showAbout(View view) {
        Intent intent = new Intent(this, Show_About.class);
        String message = resultView.getText().toString();
        intent.putExtra("resultOfConv",message);
        startActivity(intent);
    }
}
