package com.example.douglas.capitulo7ejemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuFiile:
                showMessage("File");
                break;
            case R.id.menuEdit:
                showMessage("Edit");
                break;
            case R.id.menuHelp:
                showMessage("Help");
                break;
            case R.id.menuExit:
                showMessage("Exit");
                break;
                default:
                    showMessage("Default");

        }

        return true;
    }

    public void showMessage(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
