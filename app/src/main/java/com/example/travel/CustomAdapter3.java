package com.example.travel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter3 extends RecyclerView.Adapter<CustomAdapter3.ViewHolder> {

    private Details7[] localDataSet;
    private  TextView textView11;
    private  TextView textView14;
    private  TextView textView16;
    private  TextView textView18;

    private  TextView textView21;
    private ImageView imageView6;
    private int[] resources=new int[]{R.drawable.mudeswar,R.drawable.man,R.drawable.hotel1,R.drawable.goa,R.drawable.car,R.drawable.guide,R.drawable.gangtok2,R.drawable.taj};




    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textView11);

        }

        public TextView getTextView() {
            return textView;

        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    Context context;
    public CustomAdapter3(Details7[] dataSet, Context context) {
        localDataSet = dataSet;
        this.context=context;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.combo, viewGroup, false);
        imageView6=view.findViewById(R.id.imageView6);
        textView11=view.findViewById(R.id.textView11);
        textView14=view.findViewById(R.id.textView14);
        textView16=view.findViewById(R.id.textView16);
        textView18=view.findViewById(R.id.textView18);

        textView21=view.findViewById(R.id.textView21);


        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        final  Details7 temp=localDataSet[position];

        imageView6.setImageResource(localDataSet[position].s9);
        textView11.setText(localDataSet[position].s1);
        textView14.setText(localDataSet[position].s2);
        textView16.setText(localDataSet[position].s3);
        textView18.setText(localDataSet[position].s4);

        textView21.setText(localDataSet[position].s8);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Details2.class);
                intent.putExtra("imagename",temp.s9);
                intent.putExtra("S1",temp.s1);
                intent.putExtra("S2",temp.s2);
                intent.putExtra("S3",temp.s3);
                intent.putExtra("S4",temp.s4);

                intent.putExtra("S8",temp.s8);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
