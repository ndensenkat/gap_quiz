package com.example.nden.gapquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        Intent intent = getIntent();
    }
    public void buttonOnClickNextQ5(View v)
    {
        switch (v.getId())
        {
            case R.id.nextActivity:
                Intent intent = new Intent(this, Question6.class);
                startActivity(intent);
        }
    }
}
