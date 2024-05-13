package com.example.tugas2.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas2.R
import com.example.tugas2.model.Anime
import com.example.tugas2.ui.theme.Tugas2Theme


@Composable
fun AnimeItem(
    anime: Anime,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(anime.id)
        }
    ) {
    Image(painter = painterResource(id = anime.gambar),
        contentDescription = anime.name, modifier = Modifier
            .size(160.dp)
            .clip(CircleShape)
    )
        Text(
            text = anime.name,
            style = MaterialTheme.typography.titleLarge,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(160.dp),
            maxLines = 1
        )}
}

@Preview(showBackground = true)
@Composable
fun AnimeItemPreview() {
    Tugas2Theme {
        val anime = Anime(
            id = 1,
            name = "Bleach",
            gambar = R.drawable.bleach,
            deskripsi = "Attack on Titan - Sebuah dunia pasca-apokaliptik di mana umat manusia berjuang untuk bertahan hidup melawan makhluk raksasa humanoid yang dikenal sebagai Titan."
        )
        AnimeItem(anime = anime, onItemClicked = {})
    }
}