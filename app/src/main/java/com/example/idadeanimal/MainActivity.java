package com.example.idadeanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btCalc;
    private TextView txtNum;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btCalc = findViewById(R.id.calcBt);
        txtNum = findViewById(R.id.txtNum);
        textView = findViewById(R.id.idadeTxt);

      btCalc.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String txtTexto = txtNum.getText().toString();

              if(txtTexto.isEmpty()){

              }else{

                  textView.setText("");
                  int numDigitado = Integer.parseInt(txtTexto);
                  int result = numDigitado*7;

                  textView.setText(""+result+""+"");

              }

          }
      });

    }
}
