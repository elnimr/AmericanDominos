package com.example.abdoe.amirecandominosbyabdoelnimr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText player1NameEditText = findViewById(R.id.plyer1NameEditText);
        final EditText player2NameEditText = findViewById(R.id.plyer2NameEditText);
        Button go = findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , Main2Activity.class);
                if(!(player1NameEditText.getText().toString().matches("")))
                    intent.putExtra("player1Name",player1NameEditText.getText().toString());
                else
                    intent.putExtra("player1Name","Player 1");

                if(player2NameEditText.getText().length()>0)
                    intent.putExtra("player2Name",player2NameEditText.getText().toString());
                else
                    intent.putExtra("player2Name","Player 2");

                intent.putExtra("once","1");
                startActivity(intent);



            }
        });

    }
}
