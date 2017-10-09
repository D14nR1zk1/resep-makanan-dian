package com.example.windows.resepmakanantugasdian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {

    TextView tvdetail;
    ImageView tvgambar_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        tvdetail = (TextView)findViewById(R.id.detail);
        tvgambar_detail = (ImageView)findViewById(R.id.gambar_detail);

        Intent i = getIntent();

        String titleResep = i.getStringExtra("titleBar");
        getSupportActionBar().setTitle(titleResep);

        int gambarResep = i.getIntExtra("gambarResep",0);
        tvgambar_detail.setImageResource(gambarResep);

        String detailResep = i.getStringExtra("detailResep");
        tvdetail.setText(detailResep);
    }
}
