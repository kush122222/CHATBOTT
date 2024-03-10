package com.example.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ChatRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ChatModal> chatModalArrayList;
    private Context context;

    public ChatRVAdapter(ArrayList<ChatModal> chatModalArrayList, Context context) {
        this.chatModalArrayList = chatModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_msg, parent, false);
                return new UserViewHolder(view);

            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bot_msg, parent, false);
                return new BotViewHolder(view);
        }
        return null; // or throw an exception
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ChatModal chatModal = chatModalArrayList.get(position);
        switch (chatModal.getSender()) {
            case "user":
                ((UserViewHolder) holder).userTv.setText(chatModal.getMessage());
                break;

            case "sender":
                ((BotViewHolder) holder).BotMsgTv.setText(chatModal.getMessage());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return chatModalArrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return chatModalArrayList.get(position).getSender().equals("user") ? 0 : 1;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView userTv;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userTv = itemView.findViewById(R.id.idTVUser);
        }
    }

    public static class BotViewHolder extends RecyclerView.ViewHolder {
        TextView BotMsgTv;

        public BotViewHolder(@NonNull View itemView) {
            super(itemView);
            BotMsgTv = itemView.findViewById(R.id.idTVBot);
        }
    }
}
