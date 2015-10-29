package com.example.aditya.funfactsapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG=FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook;
    private ColorWheel mColor = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);



        //display and assign values to view variables.
        final TextView funFactText= (TextView) findViewById(R.id.funFactTextView);
        final Button funFactButton = (Button) findViewById(R.id.buttonFunFact);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        Toast.makeText(this,"App has started!", Toast.LENGTH_LONG).show();

        Log.d(TAG,"We are logging in from onCreate() method!");

        funFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                mFactBook = new FactBook(res.getStringArray(R.array.app_facts));
                int color=mColor.getColor();
                funFactText.setText(mFactBook.getFact());
                relativeLayout.setBackgroundColor(color);
                funFactButton.setTextColor(color);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
