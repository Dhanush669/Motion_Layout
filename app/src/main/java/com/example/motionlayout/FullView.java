package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FullView extends AppCompatActivity {
    ImageView photo;
    TextView detailed,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);
        photo=findViewById(R.id.photoo);
        name=findViewById(R.id.namee);
        detailed=findViewById(R.id.detailss);
        Intent intent=getIntent();
        Glide.with(this).load(intent.getIntExtra("photo",R.drawable.dhoni)).centerCrop()
                .into(photo);
        detailed.setText(intent.getStringExtra("detailed"));
        int forname=intent.getIntExtra("photo",R.drawable.dhoni);
        switch (forname){
            case R.drawable.mkbhd:
                name.setText("Marques Brownlee \n       YouTuber");
                break;
            case R.drawable.dhoni:
                name.setText("Mahendra Singh Dhoni \n           Cricketer");
                break;
            case R.drawable.abd:
                name.setText("AB de Villiers \n   Cricketer");
                break;
            case R.drawable.kamal:
                name.setText("Kamal Haasan \n      Actor");
                break;
        }
    }
}