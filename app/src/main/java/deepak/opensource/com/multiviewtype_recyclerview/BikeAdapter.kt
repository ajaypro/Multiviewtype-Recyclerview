package deepak.opensource.com.multiviewtype_recyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import deepak.opensource.com.multiviewtype_recyclerview.Viewholders.BikeViewHolder
import deepak.opensource.com.multiviewtype_recyclerview.Viewholders.FooterViewHolder
import deepak.opensource.com.multiviewtype_recyclerview.Viewholders.HeaderViewholder
import deepak.opensource.com.multiviewtype_recyclerview.model.Bike
import deepak.opensource.com.multiviewtype_recyclerview.util.ViewType

/**
 * Created by Ajay Deepak on 29-05-2019.
 */
class BikeAdapter(val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var bikeList = listOf<Bike>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ViewType.HEADER.ordinal -> HeaderViewholder(LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false), context)
            ViewType.CONTENT.ordinal -> BikeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_bikes_list, parent, false), context)
            ViewType.FOOTER.ordinal -> FooterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_footer, parent, false), context)
            else -> BikeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_bikes_list, parent, false), context)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {

            ViewType.HEADER.ordinal -> {
                holder as HeaderViewholder
                holder.bindView()
            }
            ViewType.FOOTER.ordinal -> {
                holder as FooterViewHolder
                holder.bindView()
            }
            ViewType.CONTENT.ordinal -> {
                holder as BikeViewHolder
                holder.bindView(bikeList[position - 1])
            }
        }
    }

    override fun getItemCount(): Int {
        Log.i("Adapter", "${bikeList.size}")
       return bikeList.size + 2 // added 2 for header and footer
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> ViewType.HEADER.ordinal
            bikeList.size + 1 -> ViewType.FOOTER.ordinal
            else -> ViewType.CONTENT.ordinal
        }
    }

    fun setBikeList(bikeList: List<Bike>) {
        this.bikeList = bikeList
        notifyDataSetChanged()
    }
}