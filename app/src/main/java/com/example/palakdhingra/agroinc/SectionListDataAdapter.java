package com.example.palakdhingra.agroinc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder>{

    private ArrayList<SingleItemModel> itemModels;
    private Context mContext;

    public SectionListDataAdapter(ArrayList<SingleItemModel> itemModels, Context mContext) {
        this.itemModels = itemModels;
        this.mContext = mContext;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_card, null);
        SingleItemRowHolder singleItemRowHolder = new SingleItemRowHolder(v);
        return singleItemRowHolder;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        SingleItemModel itemModel = itemModels.get(position);
        holder.tvTitle.setText(itemModel.getHeader1());
        holder.itemImage.setImageResource(itemModel.getImage());
    }

    @Override
    public int getItemCount() {
        return (null != itemModels ? itemModels.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected ImageView itemImage;

        public SingleItemRowHolder(View itemView) {
            super(itemView);
            this.tvTitle = itemView.findViewById(R.id.tvTitle);
            this.itemImage = itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),ShowAgriData.class);
                    i.putExtra("header2",itemModels.get(getAdapterPosition()).getHeader2());
                    i.putExtra("header1",itemModels.get(getAdapterPosition()).getHeader1());
                    i.putExtra("header3",itemModels.get(getAdapterPosition()).getHeader3());
                    i.putExtra("header4",itemModels.get(getAdapterPosition()).getHeader4());
                    i.putExtra("header5",itemModels.get(getAdapterPosition()).getHeader5());
                    i.putExtra("header6",itemModels.get(getAdapterPosition()).getHeader6());
                    Bundle bundle=new Bundle();
                    bundle.putInt("image",itemModels.get(getAdapterPosition()).getImage());
                    i.putExtras(bundle);

                    mContext.startActivity(i);
                    Toast.makeText(view.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();


                }
            });
        }
    }

}
