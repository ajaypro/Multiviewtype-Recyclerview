package deepak.opensource.com.multiviewtype_recyclerview.ui

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import deepak.opensource.com.multiviewtype_recyclerview.Base.BaseActivity
import deepak.opensource.com.multiviewtype_recyclerview.BikeAdapter
import deepak.opensource.com.multiviewtype_recyclerview.R
import deepak.opensource.com.multiviewtype_recyclerview.model.Bike
import deepak.opensource.com.multiviewtype_recyclerview.util.DividerItemDecorator
import deepak.opensource.com.multiviewtype_recyclerview.util.VerticalSpaceItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Ajay Deepak on 29-05-2019.
 */

class BikeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initView()
    }

    fun initView() {

        val bikeAdapter = BikeAdapter(this)

        recyclerViewBikes.apply {
            layoutManager = LinearLayoutManager(this@BikeActivity)

            adapter = bikeAdapter
            bikeAdapter.setBikeList(getData())

            addItemDecoration(VerticalSpaceItemDecoration(48))
            addItemDecoration(DividerItemDecorator(this@BikeActivity))
        }
    }

    private fun getData(): List<Bike> {

        val bikeList = mutableListOf<Bike>()

        var bike =
            Bike(1, "https://www.pexels.com/photo/black-cruiser-motorcycle-2116475/", "Ducati", "Stitch dias", 19673, R.drawable.bike1)
        bikeList.add(bike)

        bike = Bike(2, "https://www.pexels.com/photo/black-cruiser-motorcycle-2116475/", "BMW", "Jessica", 12345, R.drawable.bike2)
        bikeList.add(bike)

        bike = Bike(3, "https://www.pexels.com/photo/black-and-brown-motor-scooter-2169104/", "Harley", "Douglous", 8723, R.drawable.bike3)
        bikeList.add(bike)

        bike = Bike(4, "https://www.pexels.com/photo/man-riding-motorcycle-on-highway-2056949/", "Vespa", "Giogiro", 3342, R.drawable.bike4)
        bikeList.add(bike)

        return bikeList
    }
}