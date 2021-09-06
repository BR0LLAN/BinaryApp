package com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import kotlinx.android.synthetic.main.single_educationofbotrading.view.*


class EducationOfBPTradingAdapter(private val listenerClick: OnItemClickListener,private val dataEducationOfBOTrading: ArrayList<EducationOfBOTrading>) :
    RecyclerView.Adapter<EducationOfBPTradingAdapter.EducationOfBPTradingVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationOfBPTradingVH {
        return EducationOfBPTradingVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.single_educationofbotrading, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EducationOfBPTradingVH, position: Int) {
        holder.bind(dataEducationOfBOTrading[position])
    }

    override fun getItemCount() = dataEducationOfBOTrading.size


    inner class EducationOfBPTradingVH(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        fun bind(item: EducationOfBOTrading) {
            itemView.title.text = item.title
            itemView.img_preview.setBackgroundResource(item.imgPreview)
        }

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION){
                listenerClick.listenerClickItem(position)
            }
        }
    }
    interface OnItemClickListener {
        fun listenerClickItem(id: Int)
    }
}