package com.example.nodnod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nodnod.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[], data3[], data4[];

    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], String s3[], String s4[]) {

        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        data4 = s4;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myText4.setText(data4[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2, myText3, myText4;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myText3 = itemView.findViewById(R.id.myText3);
            myText4 = itemView.findViewById(R.id.myText4);
            mainLayout = itemView.findViewById(R.id.mainLayout);

        }
    }
}
