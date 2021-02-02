package com.katepatty.katesopendata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// call UI obj id directly 呼叫畫面元件id
import kotlinx.android.synthetic.main.activity_main.*

// 資料物件
import com.katepatty.katesopendata.Posts
// 網路工具
import com.katepatty.katesopendata.AppClientManager
// 陣列-集合的轉換
import com.katepatty.katesopendata.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // trig btn to call API to data
        btn.setOnClickListener{ funcCalled()}
    }

    private fun funcCalled(){

        val apiService = AppClientManager.client.create(ApiService::class.java)
        apiService.index().enqueue(object : Callback<List<Posts>> {
            override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                val s = StringBuffer()
                val list = response.body()
                for (p in list!!) {
                    s.append(p.body)
                }
                txt.text = s.toString()
            }

            override fun onFailure(call: Call<List<Posts>>, t: Throwable) {

            }
        })

    }

}