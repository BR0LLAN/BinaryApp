package com.devcraft.binaryoptions.freeapp.presentation.ui.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.entities.Currency
import kotlinx.android.synthetic.main.single_currencies_horizontal.view.*
import java.util.*

class CurrenciesAdapter: RecyclerView.Adapter<CurrenciesAdapter.QuotesVH>() {

    var items: MutableList<Currency> = mutableListOf()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesVH {
        return QuotesVH(LayoutInflater.from(parent.context).inflate(R.layout.single_currencies_horizontal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: QuotesVH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class QuotesVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        @SuppressLint("SetTextI18n", "SimpleDateFormat")
        fun bind(item: Currency) {
            itemView.run {

                val iconResourceID = this.resources.getIdentifier(
                    "ic_" + item.symbol.lowercase(Locale.getDefault()),
                    "drawable", context.packageName)

                icon_pair.setImageResource(iconResourceID)
                q_name.text = item.symbol.replaceRange(3,3,"/")
                q_value.text = item.close.toString()
            }
        }
    }
}



