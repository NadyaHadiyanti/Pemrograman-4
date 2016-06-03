package com.example.tugasp4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterListView extends BaseAdapter {
	
	private int count;
    private Context context;
 
    public AdapterListView(int count, Context context)
    {
        this.count = count;
        this.context = context;
    }
 
    public int getCount() {
		return count; 	
    }
 
    public Object getItem(int arg0) {
		return null;
    }
 
    public long getItemId(int arg0) {
		return 0;
    }
    
    public View getView(int position, View contentView, ViewGroup arg2) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        contentView = inflater.inflate(R.layout.layout_list, null);
 
        TextView title = (TextView)contentView.findViewById(R.id.inflate_title);
        TextView body = (TextView)contentView.findViewById(R.id.inflate_body);
 
        title.setText("Title - "+position);
        body.setText("Body - "+position);
 
        return contentView;
    }
}
