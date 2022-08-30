package com.homee.jeeckbangcopy_recyclerview_20220809_0830

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.homee.jeeckbangcopy_recyclerview_20220809_0830.adapters.RoomRecyclerViewAdapter
import com.homee.jeeckbangcopy_recyclerview_20220809_0830.databinding.ActivityMainBinding
import com.homee.jeeckbangcopy_recyclerview_20220809_0830.datas.RoomData

class MainActivity : AppCompatActivity() {

//    binding 변수를 멤버변수로 만들어줄거다  :뒤에는 자료형을 써줌
    lateinit var binding : ActivityMainBinding

// 한 칸의 RoomData를 가지고 있을 ArrayList 하나를 만들어줘라
    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      멤버변수 만들어 놨던거 불러준다
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        더미 데이터 생성
        mRoomList.add( RoomData(8000, "마포구 서교동", 1, "망원/홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(28000, "마포구 서교동", 5, "홍대입구역 풀옵션 투룸") )
        mRoomList.add( RoomData(12000, "마포구 서교동", 2, "망원/홍대역 인근 신축 원룸 전세") )
        mRoomList.add( RoomData(12000, "마포구 망원동", 3, "홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(15000, "마포구 망원동", 5, "테라스가 넓은 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(13000, "마포구 망원동", 3, "넓고 반듯한 신축 원룸") )
        mRoomList.add( RoomData(9000, "마포구 연남동", 2, "홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(7500, "마포구 연남동", -2, "연남동 연습 가능 연습실") )
        mRoomList.add( RoomData(26000, "마포구 연남동", 3, "강추!! 홍대역 테라스 넓은 원룸") )
        mRoomList.add( RoomData(5500, "마포구 연남동", 0, "홍대역 풀옵션 원룸") )

        mRoomAdapter = RoomRecyclerViewAdapter(this, mRoomList)
        //binding으로 뽑아와야한다
        binding.roomRecyclerView.adapter = mRoomAdapter
//리스트뷰는 바로 위 2줄만 해도 된다 하지만 리사이클러뷰는 LayoutManager를 설정해줘야 함 얘 또한 binding이용
        binding.roomRecyclerView.layoutManager = LinearLayoutManager(this,)

    }
}