package com.example.ayfalakh.recycleview;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMain;
    private ArrayList<Movie> listMovie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);
        listMovie.addAll(OnGoingMovieData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_main:
                Toast.makeText(this,"Announcement", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_main2:
                Toast.makeText(this, "Add",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_main3:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_main4:
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
                return true;
        }
        return true;
    }
    private void showRecyclerList(){
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listPresidentAdapter = new ListMovieAdapter(this);
        listPresidentAdapter.setListPresident(listMovie);
        rvMain.setAdapter(listPresidentAdapter);
    }
}