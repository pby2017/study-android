package com.example.customchatting.chatting.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.customchatting.R;
import com.example.customchatting.chatting.model.ChattingMessage;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private ArrayList<ChattingMessage> chattingMessages;
    private String myEmail;

    public MessageAdapter(ArrayList<ChattingMessage> chattingMessages, String myEmail) {
        this.chattingMessages = chattingMessages;
        this.myEmail = myEmail;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_message, viewGroup, false);
        MessageViewHolder messageViewHolder = new MessageViewHolder(view);

        return messageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int position) {
        if (chattingMessages.get(position).getSender().equals(myEmail)) {
            messageViewHolder.messageContentText.setBackgroundResource(R.drawable.rightbubble);
            messageViewHolder.messageSenderText.setText(chattingMessages.get(position).getSender());
            messageViewHolder.messageContentText.setText(chattingMessages.get(position).getContent());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            );
            messageViewHolder.messageLinear.setLayoutParams(layoutParams);
        } else {
            messageViewHolder.messageContentText.setBackgroundResource(R.drawable.leftbubble);
            messageViewHolder.messageSenderText.setText(chattingMessages.get(position).getSender());
            messageViewHolder.messageContentText.setText(chattingMessages.get(position).getContent());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            );
            messageViewHolder.messageLinear.setLayoutParams(layoutParams);
        }
    }

    @Override
    public int getItemCount() {
        return chattingMessages.size();
    }

    class MessageViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout messageLinear;
        private TextView messageSenderText;
        private TextView messageContentText;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            messageLinear = itemView.findViewById(R.id.linear_message);
            messageSenderText = itemView.findViewById(R.id.text_message_sender);
            messageContentText = itemView.findViewById(R.id.text_message_content);
        }
    }

}
