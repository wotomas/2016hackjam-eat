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
        mUserListRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mUserListRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        List<User> userList = new ArrayList<>();
        User dummyUser = new User();
        dummyUser.email = "dummyEmail@gmail.com";
        dummyUser.displayName = "Dummy Kim";
        dummyUser.availableTimeString = "12:00 ~ 13:30";

        User dummyUser1 = new User();
        dummyUser1.email = "dwlee@gmail.com";
        dummyUser1.displayName = "Dan Lew";
        dummyUser1.availableTimeString = "12:00 ~ 13:30";

        User dummyUser2 = new User();
        dummyUser2.email = "jakewhardon@gmail.com";
        dummyUser2.displayName = "Jake Wharton";
        dummyUser2.availableTimeString = "12:00 ~ 13:30";

        User dummyUser3 = new User();
        dummyUser3.email = "blueinreis@gmail.com";
        dummyUser3.displayName = "Blue Chan";
        dummyUser3.availableTimeString = "12:00 ~ 13:30";

        userList.add(dummyUser);
        userList.add(dummyUser1);
        userList.add(dummyUser2);
        userList.add(dummyUser3);

        mAdapter = new MyAdapter(userList);
        mUserListRecyclerView.setAdapter(mAdapter);
    }


}
