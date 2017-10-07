package com.example.collisionbike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OptionActivity extends AppCompatActivity {

    String PhoneNumber = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        try {
            BufferedReader br = new BufferedReader(new FileReader(getFilesDir() + "Phone.txt"));

            PhoneNumber = br.readLine();

            EditText text = (EditText)findViewById(R.id.PhoneText);

            text.setText(PhoneNumber);

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Button S_button = (Button)findViewById(R.id.savebutton);

        S_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(getFilesDir() + "Phone.txt" , false));

                    EditText text = (EditText)findViewById(R.id.PhoneText);

                    PhoneNumber = text.getText().toString();
                    bw.write(PhoneNumber);
                    bw.flush();
                    bw.close();

                    finish();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
