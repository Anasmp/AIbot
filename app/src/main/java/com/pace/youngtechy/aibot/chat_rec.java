package com.pace.youngtechy.aibot;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class chat_rec extends RecyclerView.ViewHolder  {



    TextView leftText,rightText;
    ImageView avatar;

    public chat_rec(View itemView){
        super(itemView);

        leftText = (TextView)itemView.findViewById(R.id.leftText);
        rightText = (TextView)itemView.findViewById(R.id.rightText);
        avatar=(ImageView)itemView.findViewById(R.id.avatar);

    }
}
