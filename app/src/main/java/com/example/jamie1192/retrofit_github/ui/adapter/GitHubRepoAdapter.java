package com.example.jamie1192.retrofit_github.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jamie1192.retrofit_github.R;
import com.example.jamie1192.retrofit_github.api.model.GitHubRepo;

import java.util.List;

/**
 * Created by jamie on 17/1/18.
 */

//public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {
public class GitHubRepoAdapter extends RecyclerView.Adapter<GitHubRepoAdapter.RepoViewHolder>{

    private Context context;
    private List<GitHubRepo> repoList;

    public GitHubRepoAdapter(Context context, List<GitHubRepo> repoList) {
        this.context = context;
        this.repoList = repoList;
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item_pagination, null);

//         RepoViewHolder holder = new RepoViewHolder(view);
//
//         return holder;

//            OR just
        return new RepoViewHolder(view);

    }


    @Override
    public void onBindViewHolder(RepoViewHolder holder, int position) {

        //get the repo at the current position in the list
        GitHubRepo item = repoList.get(position);

        //Bind data with the viewholder view
        holder.textViewRepoName.setText(item.getName());
        holder.textViewDescription.setText(item.getDescription());

//        TextView textView = row.findViewById(R.id.list_item_pagination_text);
//        TextView descriptionText = row.findViewById(R.id.list_item_description);


//        String message = item.getName();
//        String description = item.getDescription();

//        textView.setText(message);
//        descriptionText.setText(description);
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }

    class RepoViewHolder extends RecyclerView.ViewHolder{

        TextView textViewRepoName, textViewDescription;


        public RepoViewHolder(View itemView) {
            super(itemView);

            textViewRepoName = itemView.findViewById(R.id.list_item_pagination_text);
            textViewDescription = itemView.findViewById(R.id.list_item_description);
        }
    }

//    Old constructor
//    public GitHubRepoAdapter(Context context, List<GitHubRepo> repoList) {
//        super(context, R.layout.list_item_pagination, repoList);
//
//        this.context = context;
//        this.repoList = repoList;
//    }

//    @Override - old method override
//    public View getView(int position, View convertView, ViewGroup parent){
//        View row = convertView;
//
//        if (row == null) {
//            LayoutInflater inflater =
//                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
//        }
//
//        TextView textView = row.findViewById(R.id.list_item_pagination_text);
//        TextView descriptionText = row.findViewById(R.id.list_item_description);
//
//        GitHubRepo item = repoList.get(position);
//        String message = item.getName();
//        String description = item.getDescription();
//
//        textView.setText(message);
//        descriptionText.setText(description);
//
//        return row;
//    }


}
