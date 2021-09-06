package com.devcraft.binaryoptions.freeapp.presentation.ui.currency

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import kotlinx.android.synthetic.main.single_one_currency_list.view.*
import java.util.*

class CurrencyBaseAndToAdapter(
    private val listenerClick: OnItemClickListener,
    private val currencies: MutableList<Currencies>
) :
    RecyclerView.Adapter<CurrencyBaseAndToAdapter.CurrencyBaseAndToVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyBaseAndToVH {
        return CurrencyBaseAndToVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.single_one_currency_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CurrencyBaseAndToVH, position: Int) {
        holder.bind(currencies[position])
    }

    override fun getItemCount() = currencies.size

    inner class CurrencyBaseAndToVH(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        @SuppressLint("SetTextI18n", "SimpleDateFormat")
        fun bind(item: Currencies) {
            itemView.run {

                val iconResourceID = this.resources.getIdentifier(
                    "ic_" + item.currencyName.lowercase(Locale.getDefault()),
                    "drawable", context.packageName
                )

                icon_pair.setImageResource(iconResourceID)
                q_name.text = item.currencyName
            }
        }

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val positionFrom = adapterPosition
            val positionTo = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listenerClick.listenerClickItem(positionFrom, positionTo)
            }
        }
    }

    interface OnItemClickListener {
        fun listenerClickItem(idFrom: Int, idTo: Int)
    }
}