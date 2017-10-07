package com.example.collisionbike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.ridingimage);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),MapActivity.class);
                startActivity(intent);
            }
        });

        ImageView iv2 = (ImageView)findViewById(R.id.optionimage);

        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),OptionActivity.class);
                startActivity(intent);
            }
        });
    }
}
