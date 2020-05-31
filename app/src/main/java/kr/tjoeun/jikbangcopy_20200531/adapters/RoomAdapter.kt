package kr.tjoeun.jikbangcopy_20200531.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import kr.tjoeun.jikbangcopy_20200531.datas.Room

class RoomAdapter(context: Context, resId:Int , list:List<Room>) : ArrayAdapter<Room>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from (mContext)



}