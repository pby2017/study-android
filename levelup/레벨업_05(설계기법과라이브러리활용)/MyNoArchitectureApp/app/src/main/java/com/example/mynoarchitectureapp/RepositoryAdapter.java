package com.example.mynoarchitectureapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.util.List;

class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder> {

    private final OnRepositoryItemClickListener onRepositoryItemClickListener;
    private final Context context;
    private List<GitHubService.RepositoryItem> items;

    public RepositoryAdapter(OnRepositoryItemClickListener onRepositoryItemClickListener, Context context) {
        this.onRepositoryItemClickListener = onRepositoryItemClickListener;
        this.context = context;
    }

    /**
     * 리포지토리의 데이터를 설정해서 갱신한다
     *
     * @param items
     */
    public void setItemsAndRefresh(List<GitHubService.RepositoryItem> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public GitHubService.RepositoryItem getItemAt(int position) {
        return items.get(position);
    }

    /**
     * RecyclerView의 아이템 뷰 생성과 뷰를 유지할 ViewHolder를 생성
     */
    @NonNull
    @Override
    public RepositoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item_repository, viewGroup, false);
        return new RepositoryViewHolder(view);
    }

    /**
     * onCreateViewHolder로 만든 ViewHolder의 뷰에
     * setItemsAndRefresh(items)으로 설정된 데이터를 넣는다
     */
    @Override
    public void onBindViewHolder(@NonNull final RepositoryViewHolder repositoryViewHolder, int position) {
        final GitHubService.RepositoryItem item = getItemAt(position);

        // 뷰가 클릭되면 클릭된 아이템을 Listener에게 알린다
        repositoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRepositoryItemClickListener.onRepositoryItemClick(item);
            }
        });

        repositoryViewHolder.repositoryName.setText(item.name);
        repositoryViewHolder.repositoryDetail.setText(item.description);
        repositoryViewHolder.starCount.setText(item.stargazers_count);

        // 이미지는 Glide라는 라이브러리로 데이터를 설정한다
        Glide.with(context)
                .load(item.owner.avatar_url)
                .asBitmap().centerCrop().into(new BitmapImageViewTarget(repositoryViewHolder.repositoryImage) {
            @Override
            protected void setResource(Bitmap resource) {
                // 이미지를 동그랗게 만든다
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                repositoryViewHolder.repositoryImage.setImageDrawable(circularBitmapDrawable);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    interface OnRepositoryItemClickListener {
        /**
         * 리포지토리의 아이템이 탭되면 호출된다
         */
        void onRepositoryItemClick(GitHubService.RepositoryItem item);
    }

    public class RepositoryViewHolder extends RecyclerView.ViewHolder {
        private final TextView repositoryName;
        private final TextView repositoryDetail;
        private final ImageView repositoryImage;
        private final TextView starCount;

        public RepositoryViewHolder(@NonNull View itemView) {
            super(itemView);
            repositoryName = itemView.findViewById(R.id.text_repository_name);
            repositoryDetail = itemView.findViewById(R.id.text_repository_detail);
            repositoryImage = itemView.findViewById(R.id.image_repository);
            starCount = itemView.findViewById(R.id.text_repository_star);
        }
    }
}
