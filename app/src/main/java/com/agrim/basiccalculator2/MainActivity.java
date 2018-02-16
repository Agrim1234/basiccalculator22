package com.agrim.basiccalculator2;

import android.app.Activity;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.agrim.basiccalculator2.R.id.btndiv;
import static com.agrim.basiccalculator2.R.id.btnmul;

public class MainActivity extends Activity implements
View.OnClickListener {

    private Button bt10, bt9, bt8, bt7, bt6, bt5, bt4, bt3, bt2, bt1, bt11, bt12 , bt13, bt14, bt15, bt16, bt17, bt18;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.btnC);
        bt1.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.btnmod);
        bt2.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.btndiv);
        bt3.setOnClickListener(this);
        bt4 = (Button) findViewById(R.id.btnseven);
        bt4.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.btneight);
        bt5.setOnClickListener(this);
        bt6 = (Button) findViewById(R.id.btnnine);
        bt6.setOnClickListener(this);
        bt7 = (Button) findViewById(R.id.btnmul);
        bt7.setOnClickListener(this);
        bt8 = (Button) findViewById(R.id.btnfour);
        bt8.setOnClickListener(this);
        bt9 = (Button) findViewById(R.id.btnfive);
        bt9.setOnClickListener(this);
        bt10 = (Button) findViewById(R.id.btnsix);
        bt10.setOnClickListener(this);
        bt11 = (Button) findViewById(R.id.btnminus);
        bt11.setOnClickListener(this);
        bt12 = (Button) findViewById(R.id.btnone);
        bt12.setOnClickListener(this);
        bt13 = (Button) findViewById(R.id.btntwo);
        bt13.setOnClickListener(this);
        bt14 = (Button) findViewById(R.id.btnthree);
        bt14.setOnClickListener(this);
        bt15 = (Button) findViewById(R.id.btnplus);
        bt15.setOnClickListener(this);
        bt16 = (Button) findViewById(R.id.btnzero);
        bt16.setOnClickListener(this);
        bt17 = (Button) findViewById(R.id.btndot);
        bt17.setOnClickListener(this);
        bt18 = (Button) findViewById(R.id.btneq);
        bt18.setOnClickListener(this);
        tv1 = (TextView) findViewById(R.id.tv1);

    }

        public static String str = "";
        public static int n,num1=0,num2=1;

    @Override
    public void onClick(View view) {
        CharSequence c;


        switch (view.getId()) {


            case R.id.btnone:
                int nu1 = 1;
                tv1.setText("" + nu1);
                break;
            case R.id.btntwo:
                int nu2 = 2;
                tv1.setText("" + nu2);
                break;
            case R.id.btnthree:
                int nu3 = 3;
                tv1.setText("" + nu3);
                break;
            case R.id.btnfour:
                int nu4 = 4;
                tv1.setText("" + nu4);
                break;
            case R.id.btnfive:
                int nu5 = 5;
                tv1.setText("" + nu5);
                break;
            case R.id.btnsix:
                int nu6 = 6;
                tv1.setText("" + nu6);
                break;
            case R.id.btnseven:
                int nu7 = 7;
                tv1.setText("" + nu7);
                break;
            case R.id.btneight:
                int nu8 = 8;
                tv1.setText("" + nu8);
                break;
            case R.id.btnnine:
                int nu9 = 9;
                tv1.setText("" + nu9);
                break;
            case R.id.btnzero:
                int nu10 = 0;
                tv1.setText("" + nu10);
                break;
            case R.id.btndiv:
                str = "/";
                break;
            case R.id.btnmul:
                str = "*";
                break;
            case R.id.btnplus:
                str = "+";
                break;
            case R.id.btnminus:
                str = "-";
                break;
            case R.id.btnmod:
                str = "%";
                break;
            case R.id.btnC:
                tv1.setText("0");
                str = "";
                num1 = 0;
                break;
            case R.id.btneq:
                if  ((str == "/") && (n==0))
                    tv1.setText("NaN");
                else
                    tv1.setText("" + num1);
                break;
        }

        if(view.getId()!= R.id.btneq)
        {c = tv1.getText();
        n = Integer.parseInt(c.toString());

        if ((view.getId() == R.id.btneight) || (view.getId() == R.id.btnfive) || (view.getId() == R.id.btnfour) || (view.getId() == R.id.btnnine) || (view.getId() == R.id.btnone) || (view.getId() == R.id.btnseven) || (view.getId() == R.id.btnsix) || (view.getId() == R.id.btnone) || (view.getId() == R.id.btnthree) || (view.getId() == R.id.btntwo) || (view.getId() == R.id.btnzero))
            {
                 if (str == "+")
                    {num1 = num1 + n;}
                 else if ((str == "*") && (num1 == 0))
                    {num1 = 1;
                    num1 = num1 * n;}
                 else if (str == "*")
                    {num1 = num1 * n;}
                 else if (str == "-")
                    {num1 = n - num1;
                    num1 = -num1;}
                 else if (str == "")
                    {num1 = n;}
                 else if ((str == "/") && (n != 0))
                    {num2 = n;
                    num1 = num1 / num2;}
                 else if (str == "%")
                    {num2 = n;
                    num1 = num1 % num2;}
            }
        }
    }
}

