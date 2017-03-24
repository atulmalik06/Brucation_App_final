package com.example.atulmalik.brucationalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tictactoe extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);

       Button buttonttt = (Button) findViewById(R.id.buttonttt);

       buttonttt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent game = new Intent(Tictactoe.this, Ticgame.class);
               Tictactoe.this.startActivity(game);
           }
       });



   }




    }


       //Button button = (Button) findViewById(R.id.buttonttt);

     //   button.setOnclickListener(new View.OnClickListener() {
       //     public void onClick(View view) {
          //      Intent intent = new Intent(getApplicationContext(), activity_game.xml);
           //     finish();




