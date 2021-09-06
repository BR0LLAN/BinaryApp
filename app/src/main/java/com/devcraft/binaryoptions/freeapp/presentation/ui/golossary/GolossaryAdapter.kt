package com.devcraft.binaryoptions.freeapp.presentation.ui.golossary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import kotlinx.android.synthetic.main.single_golossary.view.*

class GolossaryAdapter(private val itemData: ArrayList<Golossary>) :
    RecyclerView.Adapter<GolossaryVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GolossaryVH {
        return GolossaryVH(LayoutInflater.from(parent.context).inflate(R.layout.single_golossary, parent, false))
    }

    override fun onBindViewHolder(holder: GolossaryVH, position: Int) {
        holder.bind(itemData[position])
    }

    override fun getItemCount() = itemData.size
}

class GolossaryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Golossary) {
        itemView.title.text = item.title
        itemView.g_text.text = item.text
    }


}

