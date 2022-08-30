package com.homee.jeeckbangcopy_recyclerview_20220809_0830.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

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
    val mContext : Context //리사이클러뷰어댑터를 만들때 넣는 생성자들은 상속을 받을 때 필요한게 아니라 밑에 어댑터 내부 정보를 적을때 필요하다
    val mList : List<RoomData>
) : RecyclerView.Adapter<RoomRecyclerViewAdapter.MyViewHolder>(){

    //상속 받을때 기본 생성자 넣는게 우선이므로 ViewHolder뒤()내부에  itemView넣어달라고 IDE가 요구함
    /// 그 후 자식이 view를 하나 만들어서 : View로 전달 해주면 된다
    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(item : RoomData){
//             itemView - item(한칸에 들어갈 RoomData) 간의 연결(bind)

        }
    }

    //우리가 만든 이너 클래스 뷰홀더 하나를 생성하는거다 So 원래 바깥<>에 넣었던 뷰홀더가 요 생성하는 뷰홀더가 되는거다
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //view와 우리가 만든 ViewHolder를 연결하는 자리 /from(mContext) 어댑터 만들때 생성자 만들어 줬으므로 그걸 이용
        ///그리고 from(mContext)를 inflate해줘라 How)R리소스 폴더에 layout에 한 칸 xml(room_list_item)만들어 논게 있으니 그걸 들고와서 해줘라
        //그러면 한 칸의 xml열심히 만든거다 row가 한 칸의 Item을 나타내주는 View다
        val row = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, parent, false)
        return MyViewHolder(row) //우리가 만든 MyViewHolder를 리턴하려면 한 칸의 view가 필요하다
//        여기까지 코드해줘야 마이뷰홀더가 Create가 된다 그 담이 onBindViewHolder다
    }
/// onBindViewHolder는 position값이 지어지는데 이 값을 활용할거다 & holder내부에는 우리가 만든 이너클래스 MyViewHolder가 있다
////그래서 이 함수는 ViewHolder랑 내가 가진 Data를 어떻게 Bind시킬거냐는 뜻이다
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }
// So 총 이 리사이클러뷰 몇개 만들건데
    override fun getItemCount(): Int {
        return mList.size ///mList사이즈 개수만큼 만들거임
    }



}