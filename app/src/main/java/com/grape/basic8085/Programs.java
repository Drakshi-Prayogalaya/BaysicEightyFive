package com.grape.basic8085;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.purplebrain.adbuddiz.sdk.AdBuddiz;
import com.purplebrain.adbuddiz.sdk.AdBuddizLogLevel;

/**
 * Created by rarodi on 12/15/2015.
 */
public class Programs extends AppCompatActivity
{
    Button b1;
    TextView tv,tva;
    RelativeLayout rela1;

    @ColorInt
    static final int darkGreen = 0xFF1B5E20;

    String program;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programs);

        final Activity activity = this;
        AdBuddiz.setLogLevel(AdBuddizLogLevel.Info);    // log level
        AdBuddiz.setPublisherKey("0ce2b20e-7686-49b9-b4ca-74c4260feaed"); // replace with your app publisher key
        AdBuddiz.cacheAds(activity);
        AdBuddiz.showAd(this);

        //TextView tv,tva;

        tv = (TextView)findViewById(R.id.textView3);
        tva = (TextView)findViewById(R.id.textView1);

        rela1 = (RelativeLayout)findViewById(R.id.relalay1);
        rela1.setVisibility(View.GONE);
        tva.setVisibility(View.GONE);

        String fontpath = "fonts/Slabo27px-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);
        tva.setTypeface(tf);

        b1 = (Button)findViewById(R.id.button1);
        final Intent i = getIntent();

        if(i.hasExtra("c1"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c1");
            tv.setText(program);
            tva.setText("PROGRAM 1");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c2"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c2");
            tv.setText(program);
            tva.setText("PROGRAM 2");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c3"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c3");
            tv.setText(program);
            tva.setText("PROGRAM 3");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c4"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c4");
            tv.setText(program);
            tva.setText("PROGRAM 4");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c5"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c5");
            tv.setText(program);
            tva.setText("PROGRAM 5");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c6"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c6");
            tv.setText(program);
            tva.setText("PROGRAM 6");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c7"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c7");
            tv.setText(program);
            tva.setText("PROGRAM 7");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c8"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c8");
            tv.setText(program);
            tva.setText("PROGRAM 8");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c9"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c9");
            tv.setText(program);
            tva.setText("PROGRAM 9");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c10"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c10");
            tv.setText(program);
            tva.setText("PROGRAM 10");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c11"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c11");
            tv.setText(program);
            tva.setText("PROGRAM 11");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c12"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c12");
            tv.setText(program);
            tva.setText("PROGRAM 12");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c13"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c13");
            tv.setText(program);
            tva.setText("PROGRAM 13");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c14"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c14");
            tv.setText(program);
            tva.setText("PROGRAM 14");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c15"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c15");
            tv.setText(program);
            tva.setText("PROGRAM 15");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c16"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c16");
            tv.setText(program);
            tva.setText("PROGRAM 16");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c17"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c17");
            tv.setText(program);
            tva.setText("PROGRAM 17");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c18"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c18");
            tv.setText(program);
            tva.setText("PROGRAM 18");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c19"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c19");
            tv.setText(program);
            tva.setText("PROGRAM 19");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c20"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c20");
            tv.setText(program);
            tva.setText("PROGRAM 20");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c21"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c21");
            tv.setText(program);
            tva.setText("PROGRAM 21");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c22"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c22");
            tv.setText(program);
            tva.setText("PROGRAM 22");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c23"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c23");
            tv.setText(program);
            tva.setText("PROGRAM 23");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c24"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c24");
            tv.setText(program);
            tva.setText("PROGRAM 24");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c25"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c25");
            tv.setText(program);
            tva.setText("PROGRAM 25");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c26"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c26");
            tv.setText(program);
            tva.setText("PROGRAM 26");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c27"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c27");
            tv.setText(program);
            tva.setText("PROGRAM 27");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c28"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c28");
            tv.setText(program);
            tva.setText("PROGRAM 28");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c29"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c29");
            tv.setText(program);
            tva.setText("PROGRAM 29");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c30"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c30");
            tv.setText(program);
            tva.setText("PROGRAM 30");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c31"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c31");
            tv.setText(program);
            tva.setText("PROGRAM 31");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c32"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c32");
            tv.setText(program);
            tva.setText("PROGRAM 32");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c33"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c33");
            tv.setText(program);
            tva.setText("PROGRAM 33");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c34"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c34");
            tv.setText(program);
            tva.setText("PROGRAM 34");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c35"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c35");
            tv.setText(program);
            tva.setText("PROGRAM 35");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c36"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c36");
            tv.setText(program);
            tva.setText("PROGRAM 36");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c37"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c37");
            tv.setText(program);
            tva.setText("PROGRAM 37");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c38"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c38");
            tv.setText(program);
            tva.setText("PROGRAM 38");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c39"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c39");
            tv.setText(program);
            tva.setText("PROGRAM 39");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c40"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c40");
            tv.setText(program);
            tva.setText("PROGRAM 40");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c41"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c41");
            tv.setText(program);
            tva.setText("PROGRAM 41");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c42"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c42");
            tv.setText(program);
            tva.setText("PROGRAM 42");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c43"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c43");
            tv.setText(program);
            tva.setText("PROGRAM 43");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c44"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c44");
            tv.setText(program);
            tva.setText("PROGRAM 44");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c45"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c45");
            tv.setText(program);
            tva.setText("PROGRAM 45");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c46"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c46");
            tv.setText(program);
            tva.setText("PROGRAM 46");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c47"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c47");
            tv.setText(program);
            tva.setText("PROGRAM 47");
            AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c48"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c48");
            tv.setText(program);
            tva.setText("PROGRAM 48");
            AdBuddiz.cacheAds(this);
        }


        AdBuddiz.showAd(this);

        SpannableString ss = new SpannableString(program);

        // newly added code to highlight the comments
        int semiCounter = 0;
        int slashCounter = 0;
        int temp;

        for(int z=0; z<program.length(); z++)
        {
            if(program.charAt(z) == ';')
            {
                semiCounter = semiCounter + 1;
                Log.e("Semicolon", String.valueOf(semiCounter));
                temp = program.indexOf("\n", z);
                slashCounter = slashCounter + 1;
                Log.e("Slash", String.valueOf(temp));
                //0x1B5E20
                ss.setSpan(new ForegroundColorSpan(Color.rgb(27, 94, 32)), z, temp, Spanned.SPAN_INTERMEDIATE);
            }
        }

        tv.setText(ss);
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public int search(String pat, String txt)
    {
        return txt.indexOf(pat, 0);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        AdBuddiz.showAd(this);
    }

}
