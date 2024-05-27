package com.yourcompany.android.prettypics.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yourcompany.android.prettypics.model.Photo

@Composable
fun PhotoItem(photo: Photo) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(photo.url)
            .crossfade(true)
            .build(),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}