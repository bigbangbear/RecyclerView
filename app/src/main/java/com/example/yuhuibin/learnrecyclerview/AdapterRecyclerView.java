package com.example.yuhuibin.learnrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yuhuibin on 15/8/26.
 */
public class AdapterRecyclerView extends RecyclerView.Adapter
{

    private String[] data;
    private int[] type;
    public void setData(String[] data, int[] type){
        this.data = data;
        this.type = type;
    }
    /*根据item的样式，创建不同的item样式*/
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View root;
        VHolder vholder = null;

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (i){
            case 1:
                root  = inflater.inflate(R.layout.item_vholder_text_1, viewGroup, false);
                vholder = new VHolderTextView1(root);
                break;
            case 2:
                root = inflater.inflate(R.layout.item_vholder_text_2, viewGroup, false);
                vholder = new VHolderTextView2(root);
        }
        return vholder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

        VHolder vh = (VHolder)viewHolder;
        vh.render(data[i]);
    }

    /*设置Item的样式*/
    @Override
    public int getItemViewType(int position) {
        return type[position];
    }
    /*设置Item的数据*/
    @Override
    public int getItemCount() {
        return data.length;
    }
}
