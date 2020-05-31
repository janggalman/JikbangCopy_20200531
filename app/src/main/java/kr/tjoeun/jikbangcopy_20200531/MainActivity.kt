package kr.tjoeun.jikbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.tjoeun.jikbangcopy_20200531.datas.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}
