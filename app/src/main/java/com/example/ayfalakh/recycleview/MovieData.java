package com.example.ayfalakh.recycleview;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"Captain Marvel", "Captain Marvel adalah superhero wanita dari Marvel yang mempunyai banyak kekuatan setara seperti Superman. Superhero yang bernama Carol Danvers ini awalnya merupakan seorang pilot luar angkasa, konon ia mendapatakan kekuatan supernya dari bangsa alien.", String.valueOf(R.drawable.captain_marvel)},
            {"Alita", "Alita terbangun di dunia masa depan yang tak ia kenal, dan tanpa ingatan tentang siapa dirinya. Ia kemudian dibawa oleh Ido, seorang dokter simpatik yang menyadari bahwa di dalam tubuh robot Alita yang sempat terbengkalai itu terdapat hati dan jiwa seorang wanita muda dengan kisah masa lalu yang luar biasa.", String.valueOf(R.drawable.alita)},
            {"How To Train The Dragon", "Di film ketiganya ini akan berkisah tentang Hiccup (Jay Baruchel) yang berusaha memenuhi impiannya untuk menciptakan sebuah negeri impian bagi para Viking dan naga.", String.valueOf(R.drawable.how_to_train_the_dragon)},
            {"Spiderman", "Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya. Selama di Eropa pun Peter harus menghadapi banyak musuh mulai dari Hydro Man, Sandman dan Molten Man.", String.valueOf(R.drawable.spiderman)},
            {"Aladdin", "Aladdin adalah film fantasi musikal Amerika yang akan datang yang disutradarai oleh Guy Ritchie, dari skenario yang ditulis bersama dengan John August, dan diproduksi oleh Walt Disney Pictures.", String.valueOf(R.drawable.aladdin)},
            {"Star Wars", "Star Wars: Episode IX adalah film Amerika epik yang akan diproduksi, ditulis bersama dan disutradarai oleh J. Abrams. Film ini akan menjadi angsuran ketiga dari trilogi sekuel Star Wars, mengikuti The Force Awakens dan The Last Jedi, dan angsuran terakhir dari waralaba film utama Star Wars.", String.valueOf(R.drawable.star_wars)},
            {"Wonder Park", "Wonder Park berkisah tentang sebuah taman hiburan yang luar biasa, di mana imajinasi seorang gadis yang sangat kreatif bernama June (Brianna Denski) menjadi hidup.", String.valueOf(R.drawable.wonder_park)},
            {"Shazam", "Billy Batson, seorang anak yatim berusia 14 tahun yang bermasalah yang tinggal di Philadelphia, diatur untuk pindah ke rumah asuh baru - yang ketujuh berturut-turut - dengan keluarga Vazquez dan lima anak asuh lainnya. Suatu hari, Billy naik mobil subway dan menemukan dirinya diangkut ke dunia yang berbeda di mana penyihir kuno memberinya kekuatan.", String.valueOf(R.drawable.shazam)},
            {"Hellboy", "Hellboy terbaru ini akan mengambil latar sebagai sekuel Hellboy II: The Golden Army. Diangkat dari komik karya Mike Mignola, Hellboy, yang tertangkap antara dunia supernatural dan manusia, bertempur dengan seorang penyihir kuno yang ingin membalas dendam.", String.valueOf(R.drawable.hellboy)},
            {"Joker", "Joker adalah film thriller psikologis Amerika yang akan datang yang didistribusikan oleh Warner Bros Pictures dan berdasarkan pada karakter DC Comics Joker. Film ini dimaksudkan untuk menjadi yang pertama dari serangkaian film berbasis DC yang terpisah dari DC Extended Universe.", String.valueOf(R.drawable.joker)}


    };

    public static long[] dataPhoto = new long[]{
            R.drawable.captain_marvel,
            R.drawable.alita,
            R.drawable.how_to_train_the_dragon,
            R.drawable.spiderman,
            R.drawable.aladdin,
            R.drawable.star_wars,
            R.drawable.wonder_park,
            R.drawable.shazam,
            R.drawable.hellboy,
            R.drawable.joker,
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie recomended = new Movie();
            recomended.setName(aData[0]);
            recomended.setDescription(aData[1]);
            recomended.setPhoto(aData[2]);
            list.add(recomended);
        }
        return list;
    }
}