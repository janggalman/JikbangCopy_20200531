package kr.tjoeun.jikbangcopy_20200531.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.tjoeun.jikbangcopy_20200531.datas.Room

class RoomAdapter(context: Context, resId:Int , list:List<Room>) : ArrayAdapter<Room>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from (mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }



}