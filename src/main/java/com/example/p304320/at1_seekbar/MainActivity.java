package com.example.p304320.at1_seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

//Ali Albayrak - P304320 - 22/09/2017

public class MainActivity extends Activity {
    // Defining seekbar, textview and imageviews
    private SeekBar sk;
    private TextView tv;
    private ImageView image;
    private ImageView scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining connections between mainactivity.java and activity_main.xml objects
        sk = (SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.textView1);
        image = (ImageView) findViewById(R.id.imageView);
        scale = (ImageView) findViewById(R.id.imageView2);

        // Setting initial values for text and images
        tv.setText(getResources().getStringArray(R.array.array)[0]);
        new ImageHelper(0,scale,image);

        //SeekBar Listener with switch clauses
        //calls the method from ImageHelper class according to progress value(which is taken from seekbar)
        sk.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        switch(progress){
                            case 1:

                                tv.setText(getResources().getStringArray(R.array.array)[1]);
                                new ImageHelper(progress,scale,image);
                                break;
                            case 2:

                                tv.setText(getResources().getStringArray(R.array.array)[2]);
                                new ImageHelper(progress,scale,image);
                                break;
                            case 3:

                                tv.setText(getResources().getStringArray(R.array.array)[3]);
                                new ImageHelper(progress,scale,image);
                                break;
                            case 4:

                                tv.setText(getResources().getStringArray(R.array.array)[4]);
                                new ImageHelper(progress,scale,image);
                                break;
                            case 5:

                                tv.setText(getResources().getStringArray(R.array.array)[5]);
                                new ImageHelper(progress,scale,image);
                                break;
                            case 6:

                                tv.setText(getResources().getStringArray(R.array.array)[6]);
                                new ImageHelper(progress,scale,image);
                                break;

                            case 0:
                                tv.setText(getResources().getStringArray(R.array.array)[0]);
                                new ImageHelper(progress,scale,image);
                                break;

                            default:
                                tv.setText(getResources().getStringArray(R.array.array)[0]);
                                new ImageHelper(progress,scale,image);
                                break;
                        }
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // TODO Auto-generated method stub
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // TODO Auto-generated method stub
                    }
                });
        }





    }

