package com.example.abdoe.amirecandominosbyabdoelnimr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView player1Name = findViewById(R.id.Player1Name);
        final TextView player2Name = findViewById(R.id.Player2Name);
        final TextView score1 = findViewById(R.id.score1);
        final TextView score2 = findViewById(R.id.score2);

        Button nextRound = findViewById(R.id.next_round);
        Button reduce1 = findViewById(R.id.reduce1);
        Button reduce2 = findViewById(R.id.reduce2);
        Button add1_1 = findViewById(R.id.add1_1);
        Button add2_1 = findViewById(R.id.add2_1);
        Button add3_1 = findViewById(R.id.add3_1);
        Button add4_1 = findViewById(R.id.add4_1);
        Button add5_1 = findViewById(R.id.add5_1);
        Button add1_2 = findViewById(R.id.add1_2);
        Button add2_2 = findViewById(R.id.add2_2);
        Button add3_2 = findViewById(R.id.add3_2);
        Button add4_2 = findViewById(R.id.add4_2);
        Button add5_2 = findViewById(R.id.add5_2);


        player1Name.setText(getIntent().getStringExtra("player1Name"));
        player2Name.setText(getIntent().getStringExtra("player2Name"));



        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Winner.class);
                if (Integer.parseInt(score1.getText().toString()) >= 51 && !(Integer.parseInt(score2.getText().toString()) >= 51)) {
                    intent.putExtra("winner",player1Name.getText().toString());
                    intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                    intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                    score1.setText("0");
                    score2.setText("0");
                    startActivity(intent);
                }
                if (Integer.parseInt(score2.getText().toString()) >= 51&&!(Integer.parseInt(score1.getText().toString()) >= 51)) {
                    intent.putExtra("winner",player2Name.getText().toString());
                    score1.setText("0");
                    score2.setText("0");
                    intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                    intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                    startActivity(intent);
                }
            }
        });


        reduce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                if(score1_int>0){
                    score1_int--;
                    score1.setText(String.valueOf(score1_int));
                }

            }
        });


        add1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                score1_int++;
                score1.setText(String.valueOf(score1_int));
                if(score1_int>=51){
                    if((score1_int-Integer.parseInt(score2.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                score1_int=score1_int+2;
                score1.setText(String.valueOf(score1_int));
                if(score1_int>=51){
                    if((score1_int-Integer.parseInt(score2.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                score1_int=score1_int+3;
                score1.setText(String.valueOf(score1_int));
                if(score1_int>=51){
                    if((score1_int-Integer.parseInt(score2.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                score1_int=score1_int+4;
                score1.setText(String.valueOf(score1_int));
                if(score1_int>=51){
                    if((score1_int-Integer.parseInt(score2.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score1_int= Integer.parseInt(score1.getText().toString());
                score1_int=score1_int+5;
                score1.setText(String.valueOf(score1_int));
                if(score1_int>=51){
                    if((score1_int-Integer.parseInt(score2.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        //------------------------------------------------------------------------------------------
        reduce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                if(score2_int>0){
                    score2_int--;
                    score2.setText(String.valueOf(score2_int));
                }

            }
        });


        add1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                score2_int++;
                score2.setText(String.valueOf(score2_int));
                if(score2_int>=51){
                    if((score2_int-Integer.parseInt(score1.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                score2_int=score2_int+2;
                score2.setText(String.valueOf(score2_int));
                if(score2_int>=51){
                    if((score2_int-Integer.parseInt(score1.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                score2_int=score2_int+3;
                score2.setText(String.valueOf(score2_int));
                if(score2_int>=51){
                    if((score2_int-Integer.parseInt(score1.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                score2_int=score2_int+4;
                score2.setText(String.valueOf(score2_int));
                if(score2_int>=51){
                    if((score2_int-Integer.parseInt(score1.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }
            }

        });
        add5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score2_int= Integer.parseInt(score2.getText().toString());
                score2_int=score2_int+5;
                score2.setText(String.valueOf(score2_int));
                if(score2_int>=51){
                    if((score2_int-Integer.parseInt(score1.getText().toString()))>20){
                        Intent intent=new Intent(Main2Activity.this,Winner.class);
                        intent.putExtra("winner",player2Name.getText().toString());
                        score1.setText("0");
                        score2.setText("0");
                        intent.putExtra("player1Name",getIntent().getStringExtra("player1Name"));
                        intent.putExtra("player2Name",getIntent().getStringExtra("player2Name"));
                        startActivity(intent);
                    }
                }

            }

        });




    }
}
