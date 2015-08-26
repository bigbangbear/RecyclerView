package com.example.yuhuibin.learnrecyclerview;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yuhuibin on 15/8/26.
 */
public class VHolderTextView1 extends VHolder{

    private TextView textView;


    public VHolderTextView1(View root){
        super(root);
        textView = (TextView)root.findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("yuhuibin", "vholder--1");
            }
        });

    }


    @Override
    public void render(String text) {
        super.render(text);
        textView.setText(text);
    }
}
