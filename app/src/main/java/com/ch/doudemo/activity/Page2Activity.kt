package com.ch.doudemo.activity

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.ch.doudemo.R
import com.ch.doudemo.base.BaseRecAdapter
import com.ch.doudemo.base.BaseRecViewHolder
import com.ch.doudemo.widget.MyVideoPlayer

/**
 * 翻页2
 */
class Page2Activity : AppCompatActivity() {
    var rvPage2: RecyclerView? = null
    private var urlList: MutableList<String>? = null
    private var videoAdapter: ListVideoAdapter? = null
    private var snapHelper: PagerSnapHelper? = null
    private var layoutManager: LinearLayoutManager? = null
    private var currentPosition = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
//        ButterKnife.bind(this)
        initView()
        addListener()
    }

    private fun initView() {
        urlList = ArrayList<String>().also { it.addAll(ldjVideos) }

        rvPage2 = findViewById(R.id.rv_page2)
        snapHelper = PagerSnapHelper()
        snapHelper!!.attachToRecyclerView(rvPage2)
        videoAdapter = ListVideoAdapter(urlList)
        layoutManager = LinearLayoutManager(this@Page2Activity, LinearLayoutManager.VERTICAL, false)
        rvPage2?.layoutManager = layoutManager
        rvPage2?.adapter = videoAdapter
    }

    private fun addListener() {
        rvPage2!!.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {}
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        val view = snapHelper!!.findSnapView(layoutManager)

                        //当前固定后的item position
                        val position = recyclerView.getChildAdapterPosition(view!!)
                        if (currentPosition != position) {
                            //如果当前position 和 上一次固定后的position 相同, 说明是同一个, 只不过滑动了一点点, 然后又释放了
                            MyVideoPlayer.releaseAllVideos()
                            val viewHolder = recyclerView.getChildViewHolder(view!!)
                            if (viewHolder != null && viewHolder is VideoViewHolder) {
                                viewHolder.mp_video.startVideo()
                            }
                        }
                        currentPosition = position
                    }

                    RecyclerView.SCROLL_STATE_DRAGGING -> {}
                    RecyclerView.SCROLL_STATE_SETTLING -> {}
                }
            }
        })
    }

    public override fun onPause() {
        super.onPause()
        MyVideoPlayer.releaseAllVideos()
    }


}

class ListVideoAdapter(list: List<String?>?) :
    BaseRecAdapter<String?, VideoViewHolder?>(list) {
    override fun onHolder(holder: VideoViewHolder?, bean: String?, position: Int) {
        holder ?: return
        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        holder.mp_video.setUp(bean, "第" + position + "个视频", MyVideoPlayer.STATE_NORMAL)
        if (position == 0) {
            holder.mp_video.startVideo()
        }
        Glide.with(context).load(bean).into(holder.mp_video.posterImageView)
        holder.tv_title.text = "第" + position + "个视频"
    }

    override fun onCreateHolder(): VideoViewHolder {
        return VideoViewHolder(getViewByRes(R.layout.item_page2))
    }
}

class VideoViewHolder(var rootView: View) : BaseRecViewHolder(rootView) {
    var mp_video: MyVideoPlayer
    var tv_title: TextView

    init {
        mp_video = rootView.findViewById(R.id.mp_video)
        tv_title = rootView.findViewById(R.id.tv_title)
    }
}
