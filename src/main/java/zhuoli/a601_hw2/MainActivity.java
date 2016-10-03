package zhuoli.a601_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "601_hw2_zhuoli.MESSAGE";

    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonE = (Button)findViewById(R.id.buttonE);
        Button buttonA = (Button)findViewById(R.id.buttonA);
        Button buttonS = (Button)findViewById(R.id.buttonS);
        Button buttonM = (Button)findViewById(R.id.buttonM);
        Button buttonD = (Button)findViewById(R.id.buttonD);

        button0.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        button1.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );
        button2.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );
        button3.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );
        button4.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );
        button5.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );
        button6.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );
        button7.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );
        button8.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );
        button9.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        buttonC.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );
        buttonA.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );
        buttonS.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );
        buttonM.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );
        buttonD.setOnClickListener(

                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );

        buttonE.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+")
                        {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        }
                        else if (sign == "-")
                        {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        }
                        else if (sign == "*")
                        {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        }
                        else if (sign == "/")
                        {
                            if (tempDouble2 == 0)
                            {
                                // Cannot Divide By Zero
                                output.setText("error");
                            }
                            else
                            {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }

                        // Reset the Sign variable
                        sign = "";
                    }
                }
        );


    }


    }



