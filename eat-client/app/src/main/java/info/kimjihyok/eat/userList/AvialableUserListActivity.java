package info.kimjihyok.eat.userList;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import info.kimjihyok.eat.R;
import info.kimjihyok.eat.model.User;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AvialableUserListActivity extends AppCompatActivity {
    private RecyclerView mUserListRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avialable_user_list);

        mUserListRecyclerView = (RecyclerView) findViewById(R.id.user_list_recycler_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mUserListRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mUserListRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        List<User> userList = new ArrayList<>();

        mAdapter = new MyAdapter(userList);
        mUserListRecyclerView.setAdapter(mAdapter);

    }


}
