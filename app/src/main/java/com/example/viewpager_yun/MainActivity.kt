package com.example.viewpager_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_yun.adapter.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

//        페이지가 많아지면 간단하게 페이지가 넘어갈때 부드럽도록 지원하는 기능
        mainViewPager.offscreenPageLimit = 5

    }
}