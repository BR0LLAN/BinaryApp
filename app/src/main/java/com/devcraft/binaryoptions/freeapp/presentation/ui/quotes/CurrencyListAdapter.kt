package com.devcraft.binaryoptions.freeapp.presentation.ui.quotes

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.entities.Currency
import kotlinx.android.synthetic.main.single_currency_list.view.*
import java.util.*

class CurrencyListAdapter: RecyclerView.Adapter<CurrencyListAdapter.CurrenciesListVH>() {


    var items: MutableList<Currency> = mutableListOf()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrenciesListVH {
         return CurrenciesListVH(LayoutInflater.from(parent.context).inflate(R.layout.single_currency_list, parent, false)
         )
    }

    override fun onBindViewHolder(holder: CurrenciesListVH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class CurrenciesListVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
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



