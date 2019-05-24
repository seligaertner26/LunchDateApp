package com.example.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTrue;
    private Button mFalse;
   // private TextView mQuestionTextView;
    //private TrueFalse[]mAnswerKey;
    //private int mCurrentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mTrue=(Button)findViewById(R.id.button1);
        mTrue.setOnClickListener (new View.OnClickListener(){public void onClick(View v){Toast.makeText(MainActivity.this,R.string.corr_toast, Toast.LENGTH_LONG).show();}});


        mFalse=(Button)findViewById(R.id.button2);
        mFalse.setOnClickListener (new View.OnClickListener(){public void onClick(View v){Toast.makeText(MainActivity.this,R.string.incorr_toast, Toast.LENGTH_LONG).show();}});


      /*  TrueFalse[]mAnswerKey;
        mAnswerKey=new TrueFalse[]{
                new TrueFalse(R.String.frage_text, false),
                new TrueFalse(R.String.frage_alibi, true)
        };
        int mCurrentIndex = 0;*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
