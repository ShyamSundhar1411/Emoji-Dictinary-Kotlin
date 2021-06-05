package com.emojidictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclelayout.view.*

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
       return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclelayout,parent,false))
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        holder.bindEmoji("😉")
    }

    override fun getItemCount(): Int {
        return 10
    }
    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        var view : View = v
        var emo : String = ""
        fun bindEmoji(emoji: String){
            this.emo = emoji
            view.textView.text = emo

        }
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }
}