package com.example.project7_27;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Gridadapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.j1, R.drawable.j2,R.drawable.j3,R.drawable.j4,R.drawable.j5,R.drawable.j6,R.drawable.j7,R.drawable.j8,R.drawable.j9,R.drawable.j10,
                        R.drawable.j1, R.drawable.j2,R.drawable.j3,R.drawable.j4,R.drawable.j5,R.drawable.j6,R.drawable.j7,R.drawable.j8,R.drawable.j9,R.drawable.j10};

    public Gridadapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v){
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.img_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle("Large poster");
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });

        return imgv;
    }
}
