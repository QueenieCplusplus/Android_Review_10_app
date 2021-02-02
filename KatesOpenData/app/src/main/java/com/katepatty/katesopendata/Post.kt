package com.katepatty.katesopendata

import com.google.gson.annotations.SerializedName


// 幫助回傳回了的 json 物件轉為如下 List 集合物件。
class Posts {
    @SerializedName("userId")
    var userId: Int = 0
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("title")
    var title: String? = null
    @SerializedName("body")
    var body: String? = null
}