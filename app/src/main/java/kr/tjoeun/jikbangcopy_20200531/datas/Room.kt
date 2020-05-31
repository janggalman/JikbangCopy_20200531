package kr.tjoeun.jikbangcopy_20200531.datas

import java.lang.Math.abs

class Room(val price:Int, val address:String, val floor:Int ,val description:String) {

    fun getFomattedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor == 0)
        {
            return "반지하"
        }
        else
        {
            return " 지하 ${abs(this.floor)}층"
        }

    }

}