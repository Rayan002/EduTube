package com.example.edutube;

import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class recyclerview_version_adapter extends RecyclerView.Adapter<recyclerview_version_adapter.VersionVH>{

    List<recyclerview_version>  versionslist;

    public recyclerview_version_adapter(List<recyclerview_version> versions) {
        this.versionslist = versionslist;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerview_version_adapter.VersionVH holder, int position) {
        recyclerview_version Recyclerview_version = versionslist.get(position);
        holder.top_texttxt.setText(recyclerview_version.getTop_text());
        holder.versiontxt.setText(recyclerview_version.getVersion());
        holder.apileveltxt.setText(recyclerview_version.getApilevel());
        holder.descriptiontxt.setText(recyclerview_version.getDescription());

        boolean isExpandable =versionslist.get(position).isExpandable();
        holder.expandablelayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);



    }

    @Override
    public int getItemCount() {
        return versionslist.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder{

        TextView top_texttxt, versiontxt,apileveltxt,descriptiontxt;
        LinearLayout linearLayout;
        RelativeLayout expandablelayout;

        public VersionVH(@NonNull View itemView) {
            super(itemView);

            top_texttxt = itemView.findViewById(R.id.top_text);
            versiontxt = itemView.findViewById(R.id.version);
            apileveltxt = itemView.findViewById(R.id.api_level);
            descriptiontxt = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.Linear_layout);
            expandablelayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerview_version Recyclerview_version = versionslist.get(getAdapterPosition());
                    Recyclerview_version.setExpandable(!Recyclerview_version.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });


        }
    }
}