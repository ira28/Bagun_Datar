package com.example.projek3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bangun Datar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void setTitle(String title){
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = new TextView(this);
        textView.setText(title);
        textView.setTextSize(20);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(getResources().getColor(R.color.colorWhite));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_name) {
            startActivity(new Intent(MainActivity.this, Main3Activity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnketupat(View view) {
        Intent a = new Intent(MainActivity.this, Main2Activity.class);
        a.putExtra("Bangun Datar", "Belah Ketupat");
        startActivity(a);
    }

    public void btntiga(View view) {
        Intent a = new Intent(MainActivity.this, Main2Activity.class);
        a.putExtra("Bangun Datar", "Segitiga");
        startActivity(a);
    }

    public void btntrapesium(View view) {
        Intent a = new Intent(MainActivity.this, Main2Activity.class);
        a.putExtra("Bangun Datar", "Trapesium");
        startActivity(a);
    }

    public void btnlayang(View view) {
        Intent a = new Intent(MainActivity.this, Main2Activity.class);
        a.putExtra("Bangun Datar", "Layang - Layang");
        startActivity(a);
    }
}
