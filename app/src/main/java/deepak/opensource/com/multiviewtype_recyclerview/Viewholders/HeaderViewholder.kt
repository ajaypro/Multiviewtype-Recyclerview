package deepak.opensource.com.multiviewtype_recyclerview.Viewholders

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import deepak.opensource.com.multiviewtype_recyclerview.R
import kotlinx.android.synthetic.main.item_header.view.*

/**
 * Created by Ajay Deepak on 29-05-2019.
 */
class HeaderViewholder(itemview: View, val context: Context) : RecyclerView.ViewHolder(itemview) {

    fun bindView() {
        itemView.textHeader.text = context.getString(R.string.super_bikes)
        Log.i("HeaderVH", " Header")
    }
}