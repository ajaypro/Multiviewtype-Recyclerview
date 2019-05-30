package deepak.opensource.com.multiviewtype_recyclerview.Viewholders

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import deepak.opensource.com.multiviewtype_recyclerview.R
import kotlinx.android.synthetic.main.item_footer.view.*

/**
 * Created by Ajay Deepak on 29-05-2019.
 */
class FooterViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

    fun bindView() {
        itemView.textFooter.text = context.getString(R.string.footer)
        Log.i("FooterVH", "Footer")
    }
}