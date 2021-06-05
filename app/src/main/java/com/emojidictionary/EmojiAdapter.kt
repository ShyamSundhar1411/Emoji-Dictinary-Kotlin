package com.emojidictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclelayout.view.*

class EmojiAdapter(val emolist : ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
       return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclelayout,parent,false))
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        val emo = emolist[position]
        holder.bindEmoji(emo)
    }

    override fun getItemCount(): Int {
        return emolist.count()
    }
    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        var view : View = v
        var emoji: String = ""
        init{
            v.setOnClickListener(this)
        }
        fun bindEmoji(emoji: String){
            this.emoji = emoji
            view.textView.text = emoji
        }
        override fun onClick(v: View?) {
            val detailIntent = Intent(view.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji",emoji)
            startActivity(view.context,detailIntent,null)
        }

    }
}