package com.github.jetbrains.rssreader.newspaper.composeui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.github.jetbrains.rssreader.core.entity.Feed
import com.github.jetbrains.rssreader.core.entity.Post

@Preview
@Composable
private fun FeedItemPreview() {
    AppTheme {
        FeedItem(feed = PreviewData.feed) {}
    }
}

@Preview
@Composable
private fun PostPreview() {
    AppTheme {
        PostItem(item = PreviewData.post, onClick = {})
    }
}

@Preview
@Composable
private fun FeedIconPreview() {
    AppTheme {
        FeedIcon(feed = PreviewData.feed)
    }
}

@Preview
@Composable
private fun FeedIconSelectedPreview() {
    AppTheme {
        FeedIcon(feed = PreviewData.feed, true)
    }
}

private object PreviewData {
    val post = Post(
        feedTitle = "Kotlin Blog",
        title = "Productive Server-Side Development With Kotlin: Stories From The Industry",
        link = "https://blog.jetbrains.com/kotlin/2020/11/productive-server-side-development-with-kotlin-stories/",
        desc = "Kotlin was created as an alternative to Java, meaning that its application area within the JVM ecosystem was meant to be the same as Java’s. Obviously, this includes server-side development. We would love...",
        imageUrl = "https://blog.jetbrains.com/wp-content/uploads/2020/11/server.png",
        date = 42L,
        creator = "creator"
    )
    val feed = Feed(
        title = "Kotlin Blog",
        link = "blog.jetbrains.com/kotlin/",
        desc = "blog.jetbrains.com/kotlin/",
        imageUrl = null,
        posts = listOf(post),
        sourceUrl = "https://blog.jetbrains.com/feed/",
        isDefault = true
    )
}
