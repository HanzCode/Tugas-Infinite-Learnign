package com.example.tugas2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas2.Data.DummyData
import com.example.tugas2.model.Anime
import java.util.Locale.filter
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    animeId: Int?
) {
    val anime = DummyData.animeList.filter { anime ->
        anime.id == animeId
    }
    Column(
        modifier = modifier
    ) {
        // Meneruskan animeId ke komponen Detail
        Detail(animeId = animeId, animeList = anime)
    }
}


@Composable
fun Detail(
    modifier: Modifier = Modifier,
    animeId: Int?,
    animeList: List<Anime>
){
    // Pastikan animeList tidak kosong sebelum mencoba mengakses elemennya
    if (animeList.isNotEmpty()) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = animeList[0].gambar),
                    contentDescription = animeList[0].name,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = animeList[0].name,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(
                    text = animeList[0].deskripsi,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier.padding(bottom = 16.dp)
                )
            }
        }
    } else {
        Text("Anime not found")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val fakeNavController = rememberNavController()
    DetailScreen(animeId = 5, navController = fakeNavController)
}
