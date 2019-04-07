package com.example.ayfalakh.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMain;
    private ArrayList<Movie> listMovie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);
        listMovie.addAll(MovieData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listPresidentAdapter = new ListMovieAdapter(this);
        listPresidentAdapter.setListPresident(listMovie);
        rvMain.setAdapter(listPresidentAdapter);
    }
}