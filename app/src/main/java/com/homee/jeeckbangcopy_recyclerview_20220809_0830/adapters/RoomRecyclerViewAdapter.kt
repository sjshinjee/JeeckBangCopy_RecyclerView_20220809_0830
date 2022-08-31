package com.homee.jeeckbangcopy_recyclerview_20220809_0830.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.homee.jeeckbangcopy_recyclerview_20220809_0830.datas.RoomData

//class RoomRecyclerViewAdapter 뒤에 :ArrayAdapter로 받았던 것이 ListView이고 이젠 상속이 달라진다
///RecyclerView.Adapter로 코드하면 하나하나 다 받아야 하므로 귀찮으므로 다른 방식으로 한다
////class RoomRecyclerViewAdapter : 뒤에 Adapter치면 자동완성 목록중에  Adapter<VH>를 엔터치면 Import까지 다 됨
/////근데 얘는 Adapter<~~>()에서 ~~부분에 ViewHolder(VH) 어쩌고로 좀 써 줘야할게 많다 게다가 ()치면 이 친구는
////// 기본 생성자 지원을 하므로 <>에는 RecyclerView에 주는 ViewHolder를 넣어서 작성을 하는게 정석
// 7) 우리는 좀더 쉽게 하기 위해서 ViewHolder 자체를 커스터마이징 하자
// 8) RecyclerViewAdapter클래스 내부에 클래스를 생성할거다
// 9)inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){}만들고 <>내부에 우리가 만든 MyViewHolder를 자동완성으로 넣자
// 10) 참조) 이렇게 다 작성하고 나면 class RoomRecyclerViewAdapter부분에 빨간줄 뜨는데 얘는 필수구현함수가 있다는 뜻
//참조2)즉 RecyclerViewAdapter자체가 abstract로 가지고 있는 기능들이 좀 있다

class RoomRecyclerViewAdapter(
    //리사이클러뷰어댑터를 만들때 넣는 생성자들은 상속을 받을 때 필요한게 아니라 밑에 어댑터 내부 정보를 적을때 필요하다
    val mContext : Context,
    val mList : List<RoomData>
) : RecyclerView.Adapter<RoomRecyclerViewAdapter.MyViewHolder>(){

    //상속 받을때 기본 생성자 넣는게 우선이므로 ViewHolder뒤()내부에  itemView넣어달라고 IDE가 요구함
    /// 그 후 자식이 view를 하나 만들어서 : View로 전달 해주면 된다
    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(item : RoomData){
//             itemView - item(한칸에 들어갈 RoomData) 간의 연결(bind)
        }
    }


}