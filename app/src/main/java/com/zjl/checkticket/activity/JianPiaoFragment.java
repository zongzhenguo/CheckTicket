package com.zjl.checkticket.activity;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.zjl.checkticket.R;
import com.zjl.checkticket.model.Ticket;

import java.util.ArrayList;

/**
 * Created by zzg on 2016/4/30.
 * 检票Fragment
 */
public class JianPiaoFragment extends Fragment {
    TextView xinxi;
    ListView list;
    Button next;
    int kind;
    ArrayList<Ticket> tickets;
    private LvAdapter adapter;
    int start=0;
    int length=10;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        kind = getArguments().getInt("kind");
        return inflater.inflate(R.layout.tongjilist, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        xinxi = (TextView) getView().findViewById(R.id.xinxi);
        list = (ListView) getView().findViewById(R.id.list);
        next = (Button) getView().findViewById(R.id.button);
        list.setAdapter(adapter);


    }

    public void show() {


    }

    class LvAdapter extends BaseAdapter {
        private LayoutInflater mInflater;
        private ViewHolder holder;

        public LvAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return tickets.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final int tempPosition = position;
            if (convertView == null) {

                convertView = mInflater.inflate(R.layout.listitem, null);
                holder = new ViewHolder();
                holder.textView1 = (TextView) convertView.findViewById(R.id.zhonglei);
                holder.textView2 = (TextView) convertView.findViewById(R.id.shuliang);
                return convertView;
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.textView1.setText(tickets.get(position).getKind());
            holder.textView2.setText(tickets.get(position).getKind());
            return convertView;
        }
    }


    class ViewHolder {
        public TextView textView1;
        public TextView textView2;

    }
}
