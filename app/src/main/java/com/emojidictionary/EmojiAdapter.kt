package com.emojidictionary

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return 10
    }
    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }
}