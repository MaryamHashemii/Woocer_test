package com.woocer.test.data.remote.dto.response

data class JetpackRelatedPost(
    val classes: List<Any>,
    val context: String,
    val date: String,
    val excerpt: String,
    val format: Boolean,
    val id: Int,
    val img: Img,
    val rel: String,
    val title: String,
    val url: String,
    val url_meta: UrlMeta
)