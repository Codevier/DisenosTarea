package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_elegir_diseno, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.mnuNuevo:
                Toast.makeText(this.getApplicationContext(),"Ha seleccionado el diseño de WinZip",Toast.LENGTH_LONG).show();
                intent = new Intent(this, MainActivityWinzip.class);
                startActivity(intent);
                return true;
            case R.id.mnuBuscar:
                Toast.makeText(this.getApplicationContext(),"Ha seleccionado el diseño de Gmail" ,Toast.LENGTH_LONG).show();
                intent = new Intent(this, MainActivityGmail.class);
                startActivity(intent);
                return true;
            case R.id.mnuSetting:
                Toast.makeText(this.getApplicationContext(),"Ha seleccionado el diseño del Drive" ,Toast.LENGTH_LONG).show();
                intent = new Intent(this, MainActivityDrive.class);
                startActivity(intent);
                return true;
            default:

                return super.onOptionsItemSelected(item);
            }


    }

    public void onClick(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this.getApplicationContext(),"Boton deshabilitado" ,Toast.LENGTH_LONG).show();
        startActivity(intent);
        
    }


}