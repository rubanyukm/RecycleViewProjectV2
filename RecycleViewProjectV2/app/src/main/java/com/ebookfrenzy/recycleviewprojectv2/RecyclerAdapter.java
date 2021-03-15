package com.ebookfrenzy.recycleviewprojectv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Random r = new Random();
    Data data = new Data();
    String[] titles = data.getTitles();
    String[] details = data.getDetails();
    int[] images = data.getImages();
    int randomIndex = (int) (Math.random() * images.length);


    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDetail;

        ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDetail = itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Snackbar.make(v, "Click detected on item " + (position + 1), Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public int getIndex() {
        int a = 0;
        int randomIndex = 0;
        while (a < 8) {
            randomIndex = (int) (Math.random() * titles.length);
            a++;
        }
        return randomIndex;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[getIndex()]);
        viewHolder.itemDetail.setText(details[getIndex()]);
        viewHolder.itemImage.setImageResource(images[getIndex()]);
    }

}
