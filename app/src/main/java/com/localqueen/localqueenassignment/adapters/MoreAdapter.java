package com.localqueen.localqueenassignment.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.localqueen.localqueenassignment.R;
import com.localqueen.localqueenassignment.utils.ScreenDimensions;

import java.util.List;

/**
 * Created by haseeb on 17/9/17.
 */

class MoreAdapter implements ListAdapter {

    private Context context;
    private List<String> images;
    private int morecount;

    public MoreAdapter(Context mContext, List<String> moreImages, int moreImageExtraCount) {
        this.context = mContext;
        this.images = moreImages;
        this.morecount = moreImageExtraCount;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int i) {
        return images.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            grid = inflater.inflate(R.layout.layout_more_image, null);
            TextView textView = (TextView) grid.findViewById(R.id.tv_count);
            ImageView imageView = (ImageView) grid.findViewById(R.id.iv_image);
            imageView.getLayoutParams().height = ScreenDimensions.getScreenWidth(context)/3;
            imageView.getLayoutParams().width = ScreenDimensions.getScreenWidth(context)/3;
            textView.getLayoutParams().height = ScreenDimensions.getScreenWidth(context)/3;
            if (i == 5) {
                textView.setVisibility(View.VISIBLE);
                textView.setText(String.valueOf("+"+morecount+" items"));
                Glide.with(context).load(images.get(i))
                        .crossFade()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(imageView);
            }
            else {
                textView.setVisibility(View.GONE);
                textView.setText(String.valueOf("+"+morecount+" items"));
                Glide.with(context).load(images.get(i))
                        .crossFade()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(imageView);
            }
        } else {
            grid = (View) view;
        }

        return grid;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
