package com.example.p304320.at1_seekbar;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by P304320 on 22/09/2017.
 */
// Ali Albayrak - P304320
public class ImageHelper {
    public ImageHelper(int a , ImageView x , ImageView image){
        switch(a){
            case 1:
                image.setImageResource(R.drawable.one);
                x.setImageResource(R.mipmap.scales1);
                break;
            case 2:
                x.setImageResource(R.mipmap.scales2);
                image.setImageResource(R.drawable.two);
                break;
            case 3:
                x.setImageResource(R.mipmap.scales3);
                image.setImageResource(R.drawable.three);
                break;
            case 4:
                x.setImageResource(R.mipmap.scales4);
                image.setImageResource(R.drawable.four);
                break;
            case 5:
                x.setImageResource(R.mipmap.scales5);
                image.setImageResource(R.drawable.five);
                break;
            case 6:
                x.setImageResource(R.mipmap.scales6);
                image.setImageResource(R.drawable.six);
                break;
            case 0:
                image.setImageResource(R.drawable.zero);
                x.setImageResource(R.mipmap.scales0);
                break;
            default:
                image.setImageResource(R.drawable.zero);
                x.setImageResource(R.mipmap.scales0);
                break;
        }
    }
}
