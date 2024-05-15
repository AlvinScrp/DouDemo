package com.ch.doudemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import butterknife.BindView
import butterknife.ButterKnife
import com.ch.doudemo.R
import com.ch.doudemo.adapter.VerticalViewPagerAdapter
import com.ch.doudemo.widget.VerticalViewPager2
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener

/**
 * 翻页
 */
class PageActivity : AppCompatActivity() {
    var vvpBackPlay: VerticalViewPager2? = null

    var srlPage: SmartRefreshLayout? = null
    private var urlList: MutableList<String>? = null
    private var pagerAdapter: VerticalViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)
        vvpBackPlay = findViewById(R.id.vvp_back_play)
        srlPage = findViewById(R.id.srl_page)
//        ButterKnife.bind(this)
        initView()
        addListener()
    }

    private fun addListener() {
        srlPage!!.setEnableAutoLoadMore(false)
        srlPage!!.setEnableLoadMore(false)
        srlPage!!.setOnRefreshLoadMoreListener(object : OnRefreshLoadMoreListener {
            override fun onLoadMore(refreshLayout: RefreshLayout) {
                srlPage!!.postDelayed({
                    urlList!!.addAll(urlList!!)
                    pagerAdapter!!.setUrlList(urlList)
                    pagerAdapter!!.notifyDataSetChanged()
                    srlPage!!.finishLoadMore()
                }, 2000)
            }

            override fun onRefresh(refreshLayout: RefreshLayout) {}
        })
    }

    private fun initView() {
        makeData()
        pagerAdapter = VerticalViewPagerAdapter(supportFragmentManager)
        //        vvpBackPlay.setVertical(true);
        vvpBackPlay!!.setOffscreenPageLimit(10)
        pagerAdapter!!.setUrlList(urlList)
        vvpBackPlay!!.setAdapter(pagerAdapter)
        vvpBackPlay!!.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageSelected(position: Int) {
                if (position == urlList!!.size - 1) {
                    srlPage!!.setEnableAutoLoadMore(true)
                    srlPage!!.setEnableLoadMore(true)
                } else {
                    srlPage!!.setEnableAutoLoadMore(false)
                    srlPage!!.setEnableLoadMore(false)
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    private fun makeData() {
        urlList = ArrayList<String>().also { it.addAll(ldjVideos) }
    }
}
