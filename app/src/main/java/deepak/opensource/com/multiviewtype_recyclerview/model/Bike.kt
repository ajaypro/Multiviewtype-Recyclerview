package deepak.opensource.com.multiviewtype_recyclerview.model

/**
 * Created by Ajay Deepak on 29-05-2019.
 */
data class Bike(
    var imageId: Int?,
    var url: String,
    var model: String,
    var photographer: String,
    var price: Int,
    var image: Int?
) {
    // constructor(): this(0,"","","",0, null)
}