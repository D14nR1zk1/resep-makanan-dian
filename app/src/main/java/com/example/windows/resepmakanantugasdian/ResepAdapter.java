package com.example.windows.resepmakanantugasdian;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Windows on 07/10/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {

    Context ctx;
    private ArrayList<Resep> resep;

    public ResepAdapter(Context ctx, ArrayList<Resep> resep){
        this.ctx = ctx;
        this.resep = resep;
    }

    @Override
    public ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan_list,parent,false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResepViewHolder holder, final int position) {
        holder.tvNamaResep.setText(resep.get(position).getNamaResep());
        holder.tvDeskripsiResep.setText(resep.get(position).getDeskripsiResep());

        holder.tvNamaResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ctx,DetailResepActivity.class);
                i.putExtra("gambarResep",resep.get(position).getGambarResep());
                i.putExtra("detailResep",resep.get(position).getDetailResep());
                i.putExtra("titleBar",resep.get(position).getTitleResep());
                ctx.startActivities(new Intent[]{i});
            }
        });

    }

    @Override
    public int getItemCount() {
        return resep.size();
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder{
        TextView tvDeskripsiResep;
        TextView tvNamaResep;
        public ResepViewHolder(View itemView)
        {
            super(itemView);
            tvDeskripsiResep = (TextView)itemView.findViewById(R.id.DeskripsiResep);
            tvNamaResep = (TextView)itemView.findViewById(R.id.NamaResep);
        }
    }
}
