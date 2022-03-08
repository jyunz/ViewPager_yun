package com.example.viewpager_yun.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_yun.fragment.GreetingsFragment
import com.example.viewpager_yun.fragment.MyInfoFragment
import com.example.viewpager_yun.fragment.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return MyInfoFragment()
        }
        else {
            return GreetingsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "이름"
        }
        else if (position == 1) {
            return "내 정보"
        }
        else {
            return "인사말"
        }
    }
}
//getItem : 각각의 position에 맞는 Fragment가 어떤 Fragment인지 명시해 주는 함수.
//getCount : 뷰페이저가 총 몇페이지를 표현하고 싶은지 숫자로 리턴