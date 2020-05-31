package kr.tjoeun.jikbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjoeun.jikbangcopy_20200531.adapters.RoomAdapter
import kr.tjoeun.jikbangcopy_20200531.datas.BaseActivity
import kr.tjoeun.jikbangcopy_20200531.datas.Room

class MainActivity : BaseActivity() {

    val rooms = ArrayList<Room>()

    lateinit var roomAdapter:RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        rooms.add(Room(8000,"마포구 서교동",1,"마포 서교동의 방입니다."))
        rooms.add(Room(35000,"마포구 서교동",3,"마포 서교동의 방입니다."))
        rooms.add(Room(17000,"마포구 서교동",5,"마포 서교동의 방입니다."))
        rooms.add(Room(5000,"마포구 서교동",4,"마포 서교동의 방입니다."))
        rooms.add(Room(12000,"마포구 성산동",0,"마포 성산동의 방입니다."))
        rooms.add(Room(45000,"마포구 성산동",-1,"마포 성산동의 방입니다."))
        rooms.add(Room(18000,"마포구 성산동",-2,"마포 성산동의 방입니다."))
        rooms.add(Room(56000,"마포구 망원동",2,"마포 망원동의 방입니다."))
        rooms.add(Room(82000,"마포구 망원동",0,"마포 망원동의 방입니다."))
        rooms.add(Room(4000,"마포구 망원동",1,"마포 망원동의 방입니다."))

        roomAdapter = RoomAdapter(mContext,R.layout.room_list_item , rooms)

        roomListView.adapter = roomAdapter



    }

}
