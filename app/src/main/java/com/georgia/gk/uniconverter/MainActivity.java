package com.georgia.gk.uniconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ediText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText= editText.getText().toString();

                //Converting a String into double
                double kilos = Double.parseDouble(inputText);

                //Converting kilos into pounds
                double pounds = makeConversion(kilos);

                //Displaying the conversion result
                textView.setText(" " + pounds);
            }
        });


    }

    public double makeConversion(double kilos){
        //1 kilo = 2.20462 pounds
        return kilos * 2.20462;

    }
}