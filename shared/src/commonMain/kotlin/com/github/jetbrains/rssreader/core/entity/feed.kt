package com.github.jetbrains.rssreader.core.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Feed(
    @SerialName("title") val title: String,
    @SerialName("link") val link: String,
    @SerialName("description") val desc: String,
    @SerialName("imageUrl") val imageUrl: String?,
    @SerialName("posts") val posts: List<Post>,
    @SerialName("sourceUrl") val sourceUrl: String,
    @SerialName("isDefault") val isDefault: Boolean,
//    @SerialName("creator") val creator: String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Feed

        if (sourceUrl != other.sourceUrl) return false

        return true
    }

    override fun hashCode(): Int {
        return sourceUrl.hashCode()
    }
}

@Serializable
data class Post(
    @SerialName("title") val title: String,
    @SerialName("link") val link: String?,
    @SerialName("description") val desc: String?,
    @SerialName("imageUrl") val imageUrl: String?,
    @SerialName("date") val date: Long,
    @SerialName("creator") val creator: String? = null,
    val feedTitle: String? = null
)
