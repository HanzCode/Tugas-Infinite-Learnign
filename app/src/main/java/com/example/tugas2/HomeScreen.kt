package com.example.tugas2


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas2.Component.AnimeItem
import com.example.tugas2.Component.WacthItem
import com.example.tugas2.Data.DummyData
import com.example.tugas2.model.Anime
import com.example.tugas2.model.Watch
import com.example.tugas2.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    animes: List<Anime> = DummyData.animeList,
    watch: List<Watch> = DummyData.wacthNow
    ) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            Text(
                text = stringResource(R.string.trending),
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,

                ),
                modifier = Modifier.padding(start = 15.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
            ) {
                items(animes, key = { it.id }) {
                    AnimeItem(anime = it) { animeId ->
                        navController.navigate(Screen.DetailScreen.route + "/$animeId")
                    }
                }
            }
            Text(
                text = "New Episode",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(start = 15.dp)
            )
        }

        items(watch, key = { it.id }) {
            WacthItem(wacth =  it){ watchId ->
                navController.navigate(Screen.DetailScreen.route + "/$watchId")
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    val fakeNavController = rememberNavController()
    HomeScreen(navController = fakeNavController)
}