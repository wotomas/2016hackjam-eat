package info.kimjihyok.eat.userList;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.kimjihyok.eat.R;
import info.kimjihyok.eat.model.User;

/**
 * Created by jkimab on 2016. 10. 2..
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private static final String TAG = "Myadapter";
    private List<User> mDataset;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list_view_holder, parent, false);
        return new ViewHolder(v);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<User> myDataset) {
        mDataset = myDataset;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mUsername.setText(mDataset.get(position).displayName);
        holder.mEmail.setText(mDataset.get(position).email);
        holder.mAvailableTime.setText("Available Lunch Time: " + mDataset.get(position).availableTimeString);
        AdapterOnClickListener clickListener = new AdapterOnClickListener(position);
        holder.mCardView.setOnClickListener(clickListener);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    private class AdapterOnClickListener implements View.OnClickListener {
        private int position;

        public AdapterOnClickListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick(): " + position);
        }
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCardView;
        public TextView mUsername;
        public TextView mAvailableTime;
        public TextView mEmail;

        public ViewHolder(View v) {
            super(v);
            mEmail = (TextView) v.findViewById(R.id.user_email_text_view);
            mUsername = (TextView) v.findViewById(R.id.user_name_text_view);
            mAvailableTime = (TextView) v.findViewById(R.id.lunch_time_text_view);
            mCardView = (CardView) v.findViewById(R.id.card_view);
        }
    }
}


