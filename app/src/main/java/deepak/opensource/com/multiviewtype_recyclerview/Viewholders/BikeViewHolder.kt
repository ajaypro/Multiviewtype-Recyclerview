package deepak.opensource.com.multiviewtype_recyclerview.Viewholders

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import deepak.opensource.com.multiviewtype_recyclerview.R
import deepak.opensource.com.multiviewtype_recyclerview.model.Bike
import kotlinx.android.synthetic.main.item_bikes_list.view.*
import kotlin.system.measureTimeMillis

/**
 * Created by Ajay Deepak on 29-05-2019.
 */
class BikeViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

    fun bindView(bike: Bike) {
        itemView.textBikemodel.text = bike.model
        Log.i("BikeVH", "$bike.model")
        itemView.textBikePhotographer.text = context.getString(R.string.capture) + bike.photographer
        Log.i("BikeVH", "${bike.photographer}")
        itemView.textBikePrice.text = "Price: " + bike.price
        Log.i("BikeVH", "${bike.price}")

        val imageLoadTime = measureTimeMillis {
            Glide.with(context).load(bike.image!!).into(itemView.imageBike)
        }

        Log.i("Imageloadtime ", "$imageLoadTime")
    }
}