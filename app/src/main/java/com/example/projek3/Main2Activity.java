package com.example.projek3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView nilai1, nilai2, BD, totalBD;
    ImageView gambar;
    Intent a;
    EditText input1, input2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        BD = findViewById(R.id.BD);
        totalBD = findViewById(R.id.totalBD);
        gambar = findViewById(R.id.gambar);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        a = getIntent();

        proses(a);
    }

    private void proses(Intent a) {
        switch (a.getStringExtra("Bangun Datar")) {
            case "Belah Ketupat":
                getSupportActionBar().setTitle("Hitung Luas Belah Ketupat");
                BD.setText("Belah Ketupat");
                gambar.setImageResource(R.drawable.ketupat);
                nilai1.setText("Diagonal Satu");
                nilai2.setText("Diagonal Dua");
                break;
            case "Segitiga":
                getSupportActionBar().setTitle("Hitung Luas Segitiga");
                BD.setText("Segitiga");
                gambar.setImageResource(R.drawable.tiga);
                nilai1.setText("Alas");
                nilai2.setText("Tinggi");
                break;
            case "Trapesium":
                getSupportActionBar().setTitle("Hitung Luas Trapesium");
                BD.setText("Trapesium");
                gambar.setImageResource(R.drawable.tra);
                nilai1.setText("Jumlah Sisi Sejajar");
                nilai2.setText("Tinggi");
                break;
            case "Layang - Layang":
                getSupportActionBar().setTitle("Hitung Luas Layang Layang");
                BD.setText("Layang - Layang");
                gambar.setImageResource(R.drawable.layang);
                nilai1.setText("Diagonal Satu");
                nilai2.setText("Diagonal Dua");
                break;
        }
    }

    public void prosesHitung(View view) {
        double hasil, nil1, nil2;

        String s_nil1 = input1.getText().toString();
        String s_nil2 = input2.getText().toString();

        if (!s_nil1.equals("") || !s_nil2.equals("")){
            nil1 = Double.parseDouble(s_nil1);
            nil2 = Double.parseDouble(s_nil2);
            hasil = (0.5 * (nil1 * nil2));
            switch (a.getStringExtra("Bangun Datar")){
                case "Belah Ketupat":
                    totalBD.setText("Luas Belah Ketupat " + hasil);
                    break;
                case "Segitiga":
                    totalBD.setText("Luas Segitiga " + hasil);
                    break;
                case "Trapesium":
                    totalBD.setText("Luas Trapesium " +hasil);
                    break;
                case "Layang - Layang":
                    totalBD.setText("Luas Layang - Layang " + hasil);
                    break;
            }
        }else{
            Toast.makeText(Main2Activity.this, "nilai1 dan nilai2 masih kosong!", Toast.LENGTH_SHORT).show();
        }
    }
}
