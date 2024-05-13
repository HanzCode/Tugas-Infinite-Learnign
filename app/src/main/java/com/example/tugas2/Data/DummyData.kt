package com.example.tugas2.Data

import com.example.tugas2.R
import com.example.tugas2.model.Anime
import com.example.tugas2.model.New
import com.example.tugas2.model.Watch

object DummyData {
    val animeList = listOf(
        Anime(1, "AOT", R.drawable.aot, "Attack on Titan - Sebuah dunia pasca-apokaliptik di mana umat manusia berjuang untuk bertahan hidup melawan makhluk raksasa humanoid yang dikenal sebagai Titan."),
        Anime(2, "BLEACH", R.drawable.bleach, "Bleach - Mengikuti kisah Ichigo Kurosaki, yang mendapatkan kekuatan seorang Soul Reaper dan bertarung melawan roh jahat yang dikenal sebagai Hollows."),
        Anime(3, "INCREDIBLES", R.drawable.incredibles, "The Incredibles - Sebuah film animasi tentang sebuah keluarga superhero yang mencoba menjalani kehidupan pinggiran kota yang tenang sambil melawan penjahat."),
        Anime(4, "JUJUTSU_KAISEN", R.drawable.jujutsu_kaisen, "Jujutsu Kaisen - Mengikuti Yuji Itadori, seorang siswa sekolah menengah yang terlibat dalam dunia sihir dan kutukan."),
        Anime(5, "KIMETSU", R.drawable.kimetsu, "Demon Slayer: Kimetsu no Yaiba - Mengikuti Tanjiro Kamado, seorang anak muda yang menjadi pemburu iblis setelah keluarganya dibantai oleh iblis."),
        Anime(6, "RECORD_OF_RAGNAROK", R.drawable.record_of_ragnarok, "Record of Ragnarok - Para dewa dan tokoh mitos bertarung melawan prajurit terhebat umat manusia dalam sebuah turnamen untuk menentukan nasib umat manusia."),
        Anime(7, "SOLO_LEVELING", R.drawable.solo_leveling, "Solo Leveling - Mengikuti Sung Jin-Woo, yang naik dari menjadi pemburu terlemah menjadi yang terkuat, setelah menemukan dirinya di dunia di mana monster ada."),
        Anime(8, "TOKYO_REVENGERS", R.drawable.tokyo_revengers, "Tokyo Revengers - Seorang pemuda menemukan bahwa ia memiliki kemampuan untuk melakukan perjalanan waktu, dan ia menggunakan kekuatan ini untuk mencegah sebuah peristiwa tragis terjadi."),
        Anime(9, "VINLAND_SAGA", R.drawable.vinland_saga, "Vinland Saga - Mengikuti Thorfinn, seorang prajurit Viking muda yang mencari balas dendam terhadap pria yang membunuh ayahnya."),
        Anime(10, "SPY_FAMILY", R.drawable.spy_family, "Spy x Family - Mengikuti seorang mata-mata yang mengadopsi seorang gadis kecil dan seorang pembunuh bayaran yang berpura-pura menjadi keluarga untuk melaksanakan misi mereka.")
    )

    val wacthNow = listOf(
        Watch(1, "AOT", R.drawable.aot),
        Watch(2, "BLEACH", R.drawable.bleach),
        Watch(3, "INCREDIBLES", R.drawable.incredibles),
        Watch(4, "JUJUTSU_KAISEN", R.drawable.jujutsu_kaisen),
        Watch(5, "KIMETSU", R.drawable.kimetsu),
        Watch(6, "RECORD_OF_RAGNAROK", R.drawable.record_of_ragnarok),
        Watch(7, "SOLO_LEVELING", R.drawable.solo_leveling),
        Watch(8, "TOKYO_REVENGERS", R.drawable.tokyo_revengers),
        Watch(9, "VINLAND_SAGA", R.drawable.vinland_saga),
        Watch(10, "SPY_FAMILY", R.drawable.spy_family)
    )

    val newAnimeGrid = listOf(
      New(1, "SPY_FAMILY", R.drawable.spy_family),
      New(2, "BLEACH", R.drawable.bleach),
      New(3, "INCREDIBLES", R.drawable.incredibles),
      New(4, "JUJUTSU_KAISEN", R.drawable.jujutsu_kaisen),
      New(5, "KIMETSU", R.drawable.kimetsu),
      New(6, "RECORD_OF_RAGNAROK", R.drawable.record_of_ragnarok),
      New(7, "SOLO_LEVELING", R.drawable.solo_leveling),
      New(8, "TOKYO_REVENGERS", R.drawable.tokyo_revengers),
      New(9, "AOT", R.drawable.aot),
      New(10, "VINLAND_SAGA", R.drawable.vinland_saga),
    )

}
