package com.dzaki.sierra.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//deklarasi view
    EditText nilai1 , nilai2;
    TextView hasil;
    Button tambah, kali, kurang, bagi, hapus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//inisialisasi view
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hasil = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kali = findViewById(R.id.kali);
        kurang = findViewById(R.id.kurang);
        bagi = findViewById(R.id.bagi);
        hapus = findViewById(R.id.hapus);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "must be filled if it is not filled it will be an error\n", Toast.LENGTH_SHORT).show();
                }else {
                    tambah();
                }
            }
        });
        
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "must be filled if it is not filled it will be an error\n", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }
            }
        });
        
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "must be filled if it is not filled it will be an error\n", Toast.LENGTH_SHORT).show();
                }else {
                    kurang();
                }
            }
        });
        
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "must be filled if it is not filled it will be an error\n", Toast.LENGTH_SHORT).show();
                }else {
                    bagi();
                }
            }
        });
        
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapus();
            }
        });

    }
    //todo method
     void tambah(){
        double angka1 = Double.parseDouble(nilai1.getText().toString());
         double angka2 = Double.parseDouble(nilai2.getText().toString());
         double total = angka1 + angka2;
         hasil.setText(String.valueOf(total));
     }

     void kali(){
         double angka1 = Double.parseDouble(nilai1.getText().toString());
         double angka2 = Double.parseDouble(nilai2.getText().toString());
         double total = angka1 * angka2;
         hasil.setText(String.valueOf(total));
     }

     void kurang(){
         double angka1 = Double.parseDouble(nilai1.getText().toString());
         double angka2 = Double.parseDouble(nilai2.getText().toString());
         double total = angka1 - angka2;
         hasil.setText(String.valueOf(total));
     }

     void bagi(){
          double angka1 = Double.parseDouble(nilai1.getText().toString());
          double angka2 = Double.parseDouble(nilai2.getText().toString());
          double total = angka1 / angka2;
         hasil.setText(String.valueOf(total));
     }

     void hapus(){
       nilai1.setText("");
         nilai2.setText("");

     }
    }

