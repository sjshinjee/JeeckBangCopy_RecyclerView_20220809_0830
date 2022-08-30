package com.homee.jeeckbangcopy_recyclerview_20220809_0830

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.homee.jeeckbangcopy_recyclerview_20220809_0830.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    binding 변수를 멤버변수로 만들어줄거다  :뒤에는 자료형을 써줌
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      멤버변수 만들어 놨던거 불러준다
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}