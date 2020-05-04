package com.myapps.sahan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final double[] num1 = new double[1];
        final double[] ans1 = new double[1];
        final int[] calculations = new int[1];


        final TextView textView=(TextView) findViewById(R.id.textView);
        Button clearbtn=(Button) findViewById(R.id.clearbtn);
        final EditText editText=(EditText) findViewById(R.id.editText);
        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        Button button5=(Button) findViewById(R.id.button5);
        Button button6=(Button) findViewById(R.id.button6);
        Button button7=(Button) findViewById(R.id.button7);
        Button button8=(Button) findViewById(R.id.button8);
        Button button9=(Button) findViewById(R.id.button9);
        Button button10=(Button) findViewById(R.id.button10);
        Button equalbtn=(Button) findViewById(R.id.equalbtn);
        Button minusbtn=(Button) findViewById(R.id.minusbtn);
        Button plusbtn=(Button) findViewById(R.id.plusbtn);
        Button devidebtn=(Button) findViewById(R.id.devidebtn);
        Button multiplebtn=(Button) findViewById(R.id.multiplebtn);
        Button plusminusbtn=(Button) findViewById(R.id.plusminusbtn);
        Button dotbtn=(Button) findViewById(R.id.dotbtn);
        Button backspacebtn=(Button) findViewById(R.id.backspacebtn);




        clearbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    editText.setText("");
                    textView.setText("");
            }
        } );

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        } );
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        } );

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        } );

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        } );

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        } );

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        } );

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        } );

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        } );

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        } );

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        } );

        dotbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        } );

        plusbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               double num = Double.parseDouble(editText.getText().toString());
                num1[0] =num;
                textView.setText((num1[0]+"+").toString());
                calculations[0] =1;
                editText.setText("");

            }
        } );

        minusbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(editText.getText().toString());
                num1[0] =num;
                textView.setText((num1[0]+"-").toString());
                calculations[0] =2;
                editText.setText("");

            }
        } );

        multiplebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(editText.getText().toString());
                num1[0] =num;
                textView.setText((num1[0]+"X").toString());
                calculations[0] =3;
                editText.setText("");

            }
        } );

        devidebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(editText.getText().toString());
                num1[0] =num;
                textView.setText((num1[0]+"/").toString());
                calculations[0] =4;
                editText.setText("");

            }
        } );


        equalbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("");
                double num = Double.parseDouble(editText.getText().toString());
                if(calculations[0]==1){
                    ans1[0] =num1[0]+num;
                    }
                else if (calculations[0]==2) {
                    ans1[0] =num1[0]-num;}
                else if (calculations[0]==3) {
                    ans1[0] =num1[0]*num;}

                else if(calculations[0]==4){
                    ans1[0] =num1[0]*num;}

                editText.setText(Double.toString(ans1[0]));

            }
        } );


        plusminusbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(editText.getText().toString());
                num=num*-1;
                editText.setText(Double.toString(num));

            }
        } );

        backspacebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int length=editText.getText().length();
                int number=editText.getText().length()-1;
                String store;
                if (length>0){

                    StringBuilder back= new StringBuilder(editText.getText());
                    char s=back.charAt(length);

                    back.deleteCharAt(number);
                    store=back.toString();
                    editText.setText(store);


                }
            }
        } );


























    }
}
