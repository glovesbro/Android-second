package home.roy.homeactivity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends ActionBarActivity
{

    private RecyclerView mRecyclerView;
    private List<String> Students;
    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_recyclerview);

        initData();
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter = new HomeAdapter());

    }

    protected void initData()
    {
        Students = new ArrayList<String>();
        Students.add("罗秀妮"+"2016214217");
        Students.add("刘根"+"2016214561");
        Students.add("阮荣鑫"+"2016217788");
        Students.add("范力方"+"2016216548");
        Students.add("王小明"+"2015425678");
        Students.add("李四哈"+"2015469987");
        Students.add("老王"+"2014567898");
        Students.add("ABC"+"2013456921");
        Students.add("QQQ"+"2016124536");
        Students.add("小红"+"2014235663");
        Students.add("小刚"+"2012455421");
        Students.add("小智"+"2010254687");
    }

    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
    {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    HomeActivity.this).inflate(R.layout.item_home, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position)
        {
            holder.tv.setText(Students.get(position));
        }

        @Override
        public int getItemCount()
        {
            return Students.size();
        }

        class MyViewHolder extends ViewHolder
        {

            TextView tv;

            public MyViewHolder(View view)
            {
                super(view);
                tv = (TextView) view.findViewById(R.id.id_num);
            }
        }
    }

}
