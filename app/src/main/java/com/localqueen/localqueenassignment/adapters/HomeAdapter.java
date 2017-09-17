package com.localqueen.localqueenassignment.adapters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.localqueen.localqueenassignment.R;
import com.localqueen.localqueenassignment.models.CommentModel;
import com.localqueen.localqueenassignment.models.HomeData;
import com.localqueen.localqueenassignment.utils.CircleImageView;
import com.localqueen.localqueenassignment.utils.ScreenDimensions;
import com.localqueen.localqueenassignment.viewHolders.ViewHolder1;
import com.localqueen.localqueenassignment.viewHolders.ViewHolder2;
import com.localqueen.localqueenassignment.viewHolders.ViewHolder3;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by haseeb on 16/9/17.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int HOLDER1 = 1;
    private static final int HOLDER2 = 2;
    private static final int HOLDER3 = 3;
    private Context mContext;
    private List<HomeData> data;

    public HomeAdapter(Context context, List<HomeData> data) {

        this.mContext = context;
        this.data = data;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case HOLDER1:
                View v1 = inflater.inflate(R.layout.layout_viewholder1, parent, false);
                viewHolder = new ViewHolder1(v1);
                break;
            case HOLDER2:
                View v2 = inflater.inflate(R.layout.layout_viewholder2, parent, false);
                viewHolder = new ViewHolder2(v2);
                break;
            case HOLDER3:
                View v3 = inflater.inflate(R.layout.layout_viewholder3, parent, false);
                viewHolder = new ViewHolder3(v3);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case HOLDER1:
                ViewHolder1 vh1 = (ViewHolder1) holder;
                configureViewHolder1(vh1, position);
                break;

            case HOLDER2:
                ViewHolder2 vh2 = (ViewHolder2) holder;
                configureViewHolder2(vh2, position);
                break;

            case HOLDER3:
                ViewHolder3 vh3 = (ViewHolder3) holder;
                configureViewHolder3(vh3, position);
        }
    }


    private void configureViewHolder1(ViewHolder1 vh1, int position) {

    }

    private void configureViewHolder2(final ViewHolder2 vh2, int position) {
        final HomeData item = data.get(position);
        vh2.getTv_sellername().setText(item.getUsername());
        vh2.getTv_sellerlocation().setText(item.getLocation());
        vh2.getTv_storeDescription().setText(item.getStoreDescription());
        if (item.getFollow()) {
            vh2.getTv_follow().setText("Following");
        } else {
            vh2.getTv_follow().setText("+ Follow");
        }

        vh2.getTv_userDescription().setText(item.getUserDescription());


        configurePremiumItems(vh2, item.getPremiumImages(), item.getPremiumExtraCount());

        if (item.getLike()) {
            vh2.getTv_like().setText(String.valueOf(item.getLikes()));
            vh2.getTv_like().setCompoundDrawablesWithIntrinsicBounds(mContext.getResources().getDrawable(R.drawable.ic_like), null, null, null);
        }

        confilgureMoreItems(vh2.getGv_more(), item.getMoreImages(), item.getMoreImageExtraCount());
        vh2.getIv_comment().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item.getCommentOpen()) {
                    vh2.getLv_commentholder().setVisibility(View.GONE);
                    item.setCommentOpen(false);
                } else {
                    vh2.getLv_commentholder().setVisibility(View.VISIBLE);
                    configureCommentSection(vh2.getLv_commentholder(), item.getComments());
                    item.setCommentOpen(true);
                }
            }
        });

        Glide.with(mContext).load(item.getProfilepic())
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh2.getCv_comment_user_prof_pic());
        Glide.with(mContext).load(item.getProfilepic())
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh2.getIv_sellerpic());
        vh2.getLv_sendcomment().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String comment = vh2.getEt_comment().getText().toString();
                if (item.getCommentOpen()) {
                    CommentModel model = new CommentModel();
                    model.setName("Haseeb Usman");
                    model.setLocation("Bangalore");
                    model.setProf_image(item.getProfilepic());
                    model.setComment(comment);
                    item.getComments().add(model);
                    configureCommentSection(vh2.getLv_commentholder(), item.getComments());
                } else {
                    CommentModel model = new CommentModel();
                    model.setName("Haseeb Usman");
                    model.setLocation("Bangalore");
                    model.setProf_image(item.getProfilepic());
                    model.setComment(comment);
                    item.getComments().add(model);
                    vh2.getLv_commentholder().setVisibility(View.VISIBLE);
                    configureCommentSection(vh2.getLv_commentholder(), item.getComments());
                    item.setCommentOpen(true);
                }

                vh2.getEt_comment().setText("");
            }
        });

    }

    private void configurePremiumItems(ViewHolder2 vh2, List<String> premiumImages, int premiumExtraCount) {

        vh2.getIv_stoke_image_1().getLayoutParams().height = 2 * (ScreenDimensions.getScreenWidth(mContext) / 3);
        vh2.getIv_stock_image_2().getLayoutParams().height = ScreenDimensions.getScreenWidth(mContext) / 3;
        vh2.getIv_stock_image_3().getLayoutParams().height = ScreenDimensions.getScreenWidth(mContext) / 3;
        vh2.getTv_premium_extra_count().getLayoutParams().height = ScreenDimensions.getScreenWidth(mContext) / 3;
        vh2.getTv_premium_extra_count().getLayoutParams().width = ScreenDimensions.getScreenWidth(mContext) / 3;

        Glide.with(mContext).load(premiumImages.get(0))
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh2.getIv_stoke_image_1());
        Glide.with(mContext).load(premiumImages.get(1))
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh2.getIv_stock_image_2());
        Glide.with(mContext).load(premiumImages.get(2))
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh2.getIv_stock_image_3());
        vh2.getTv_premium_extra_count().setText("+" + String.valueOf(premiumExtraCount));
    }

    private void configureCommentSection(LinearLayout lv_commentholder, final List<CommentModel> comments) {
        lv_commentholder.removeAllViews();
        for (int i = 0; i < comments.size(); i++) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.comment_item, null);
            CircleImageView cv_prof = (CircleImageView) view.findViewById(R.id.cv_comment_user);
            TextView tv_com = (TextView) view.findViewById(R.id.tv_comment_content);

            String content = "<font color='#311B92'>" + comments.get(i).getName() + "</font>" + " " + comments.get(i).getLocation() + " " + "<font color='#000000'>" + comments.get(i).getComment() + "</font>";
            tv_com.setText(Html.fromHtml(content));
//            System.out.println(content+" , "+content.length());

            Glide.with(mContext).load(comments.get(i).getProf_image())
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(cv_prof);
            final int finalI = i;
            tv_com.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Pattern pattern = Pattern.compile("\\d{10}");
                    Matcher matcher = pattern.matcher(comments.get(finalI).getComment());
                    if (matcher.find()) {
                        System.out.println(matcher.group(0));
                        openWhatsapp(matcher.group(0));
                    }
                }
            });
            lv_commentholder.addView(view);
        }

    }

    private void openWhatsapp(String num) {
        Uri mUri = Uri.parse("smsto:"+num);
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        mIntent.putExtra("sms_body", "The text goes here");
        mIntent.putExtra("chat", true);
        mContext.startActivity(mIntent);

    }

    private void confilgureMoreItems(GridView gridView, List<String> moreImages, int moreImageExtraCount) {
        // Instance of ImageAdapter Class
        gridView.getLayoutParams().height = 2 * (ScreenDimensions.getScreenWidth(mContext) / 3);
        gridView.setAdapter(new MoreAdapter(mContext, moreImages, moreImageExtraCount));
    }


    private void configureViewHolder3(ViewHolder3 vh3, int position) {
        HomeData data2 = data.get(position);
        Glide.with(mContext).load(data2.getProfilepic())
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(vh3.getIv_profileic());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (data.get(position).getAction().equals("post")) {
            return HOLDER3;
        } else if (data.get(position).getAction().equals("tabs")) {
            return HOLDER1;
        } else {
            return HOLDER2;
        }
    }

}
