package com.example.tugas2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(160.dp)
                .clip(CircleShape),
            painter = painterResource(R.drawable.foto_profil), // Ganti dengan resource gambar Anda
            contentDescription = "Foto Profil"
        )

        Text(
            text = stringResource(R.string.nama_lengkap),
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )

        Text(
            text = stringResource(R.string.email),
            color = Color.Gray,
            style = TextStyle(fontSize = 16.sp)
        )

        Text(
            text = stringResource(R.string.kampus),
            color = Color.Gray,
            style = TextStyle(fontSize = 16.sp)
        )

        Text(
            text = stringResource(R.string.jurusan),
            color = Color.Gray,
            style = TextStyle(fontSize = 16.sp)
        )

    }
}

@Preview
@Composable
fun AboutScreenPrev() {
    AboutScreen()
}
