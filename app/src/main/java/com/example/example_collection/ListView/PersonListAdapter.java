package com.example.example_collection.ListView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.example_collection.R;

import java.util.ArrayList;

public class PersonListAdapter extends BaseAdapter {


    private ListViewActivity mListViewActivity;
    private int mLayoutRes;
    private ArrayList<Person> mPersonArrayList;


    /**
     * 存储View控件含有的数据
     * 省去创建一个额外的外部类存储数据
     */
    private static class ViewHolder{
        TextView name;
        TextView age;
    }

    /**
     * 该类的构造函数，存入数据
     * @param listViewActivity      为哪个Activity服务
     * @param adapter_view_layout   用来填充的布局
     * @param personArrayList       用来填充的数据
     */
    public PersonListAdapter(ListViewActivity listViewActivity, int adapter_view_layout, ArrayList<Person> personArrayList) {
        this.mListViewActivity = listViewActivity;
        this.mLayoutRes = adapter_view_layout;
        this.mPersonArrayList = personArrayList;
    }

    @Override
    public int getCount() {
        return mPersonArrayList.size();
    }

    /**
     * 没用，看ArrayAdapter源码
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     * 没用 暂时不知道能干啥
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获取人物数据
        String name = mPersonArrayList.get(position).getNewName();
        int age = mPersonArrayList.get(position).getNewAge();

        ViewHolder holder;

        if (convertView == null){
            /**
             * parent提供布局宽高属性使mLayoutRes的布局有了作用，如果parent为null则mLayoutRes设置的宽高没有效果。 **根布局所有属性消失**
             * attachRoot在Adapter中只能是false。因为ture会调用AdapterView的addView方法而在AdapterView中addViwe不支持，会报错。
             * attachRoot在fragment中可以设置true
             */
            convertView = LayoutInflater.from(mListViewActivity).inflate(mLayoutRes,parent,false);
            holder = new ViewHolder();
            holder.name = convertView.findViewById(R.id.textView_Adapter);
            holder.age = convertView.findViewById(R.id.textView_Adapter2);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(name);
        //setText(一定是字符类型)
        holder.age.setText(Integer.toString(age));
        return convertView;
    }
}
