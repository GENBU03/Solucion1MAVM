package com.example.solucion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText capital, tasa, tiempo;
TextView interes, acumulado;
Button nuevo, calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        capital = findViewById(R.id.txtcapital);
        tasa = findViewById(R.id.txttasa);
        tiempo = findViewById(R.id.txttiempo);
        interes = findViewById(R.id.lblinteres);
        acumulado = findViewById(R.id.lblacumulado);
        nuevo = findViewById(R.id.btnnuevo);
        calcular = findViewById(R.id.btncalcular);

        // Boton calcular
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ca = Double.valueOf(capital.getText().toString()).doubleValue();
                double ta = Double.valueOf(tasa.getText().toString()).doubleValue();
                double ti = Double.valueOf(tiempo.getText().toString()).doubleValue();
                InteresCompuesto objeto = new InteresCompuesto(ca, ta, ti);
                interes.setText(String.format("%.2f",objeto.Interes()));
                acumulado.setText(String.format("%.2f",objeto.Acumulado()));
            }
        });

        // Boton nuevo
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capital.setText("");
                tasa.setText("");
                tiempo.setText("");
                interes.setText("0.00");
                acumulado.setText("0.00");
                capital.requestFocus();

            }
        });
    }
}