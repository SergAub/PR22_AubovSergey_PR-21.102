package com.example.pr22_aubovsergey_pr_21102;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class GridAdapter extends BaseAdapter
{
    private Context mContext;
    private Integer mCols, mRows;

    public GridAdapter(Context context, int cols, int rows)
    {
        mContext = context;
        mCols = cols;
        mRows = rows;
    }

    @Override
    public int getCount() {
        return mCols * mRows;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView view; // выводиться у нас будет картинка

        if (convertView == null)
            view = new ImageView(mContext);
        else
            view = (ImageView)convertView;

        view.setImageResource(R.drawable.animal7);

        return view;
    }
}

