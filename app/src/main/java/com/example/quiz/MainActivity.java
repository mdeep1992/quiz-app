package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnyes;
    private Button btnno;
    private TextView txtque;
    private ImageView img;
    private int CurrentIndex=0;
    private question[]questionbank=new question[]{
new question(R.string.question1 ,false),
   new question(R.string.question2,true),
            new question(R.string.question3,false),
            new question(R.string.question4,false),
            new question(R.string.question5,false),
            new question(R.string.question6,true)

    };
    private int[] images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnno =findViewById(R.id.btnno);
        btnyes=findViewById(R.id.btnyes);
        txtque=findViewById(R.id.txtque);
        img=findViewById(R.id.img);
        btnyes.setOnClickListener(this);
        btnno.setOnClickListener( this);
        images= new int[]{
                R.mipmap.billgates,R.mipmap.mice,R.mipmap.sydney,R.mipmap.cube,R.mipmap.lungs,R.mipmap.p6
        };
        img.setImageResource(images[CurrentIndex]);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnno:
                checkAns(false);
                CurrentIndex++;
                updateque();
                break;
            case R.id.btnyes:
         checkAns(true);
                CurrentIndex++;
                updateque();
                break;
        }

    }
    private  void updateque(){
        if(CurrentIndex<questionbank.length){
            txtque.setText(questionbank[CurrentIndex].getAnsid());
        img.setImageResource(images[CurrentIndex]);

    }else{
        txtque.setText("TOTAL MARKS " + correctcount);
        btnno.setVisibility(View.GONE);
        btnyes.setVisibility(View.GONE);
        img.setVisibility(View.GONE);

    }}

    private static int correctcount=0;
    private void checkAns(boolean uans){
        boolean isTrue=questionbank[CurrentIndex].isAns();
        if(uans==isTrue) {
            correctcount++;
        }
        }
    }


