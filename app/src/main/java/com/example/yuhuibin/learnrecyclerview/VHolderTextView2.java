package com.example.yuhuibin.learnrecyclerview;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yuhuibin on 15/8/26.
 */
public class VHolderTextView2 extends VHolder{

    private TextView textView1;
    private TextView textView2;

    public VHolderTextView2(View root) {
        super(root);
        textView1 = (TextView)root.findViewById(R.id.text);
        textView2 = (TextView)root.findViewById(R.id.text_1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("yuhuibin", "vholder--2--1");
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("yuhuibin", "vholder--2--2");
            }
        });
    }

    @Override
    public void render(String text) {
        super.render(text);
        textView1.setText(text);
        textView2.setText(text);
    }
}
