package kr.tjoeun.jikbangcopy_20200531.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.tjoeun.jikbangcopy_20200531.R
import kr.tjoeun.jikbangcopy_20200531.datas.Room

class RoomAdapter(context: Context, resId:Int , list:List<Room>) : ArrayAdapter<Room>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from (mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList.get(position)

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val memoTxt = row.findViewById<TextView>(R.id.memoTxt)

        priceTxt.text = data.price.toString()
        addressTxt.text = "${data.address},${data.floor}층"
        memoTxt.text = data.description

        return row

    }



}