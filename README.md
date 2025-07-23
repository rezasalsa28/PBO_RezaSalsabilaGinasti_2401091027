# Nama : Reza Salsabila Ginasti #
# Nim : 2401091027 #
# Kelas : MI 1C #

Pada Praktek tanggal 20-02-25, mengerjakan aritmatika, operator relasi, variabel 1 dan variabel dua. Dari modul 4, 
yang di mana saya menyalin dan memahami apa yang ada di modul tersebut dan mencobanya.Dan juga masa beradaptasi dengan java.

Pada Praktek tanggal 20-03-25, mengerjakan aritmatika, bilangan ganjil dan tugas latihan yang dikasih.

Pada praktek tanggal 26-02-25, dilanjutkan dengan operator increment,operator diincrement,operator kondisi,oparator not,operator or,operator xor,dan  operator relasi dan tugas 4.11.1. Masih berdasarkan modul 4. Operator increment ditandai (k= j++ + i;), sementara operator relasi((" i > j = " + (i > j));)

Pada Praktek tanggal 04-03-25, mengerjakan operator And, operator kondisi, operator Not, operator OR, dan operator XOR. Operator And (menggabungkan dua kondisi dengan menggunakan && sebagai syarat kondisi yang di mana harus terpenuhi dua kondisi tersebut). Operator kondisi bisa dicontohkan sebagai berikut (status = (grade >= 60)?"Passesd":"Fail";), operator NOT bisa dicontohkan sebagai berikut (System.out.println(!val1);), kemudian operator Or (menggabungkan dua kondisi dengan menggunakan || sebagai syarat kondisi yang di mana harus terpenuhi salah satu kondisi tersebut), yang terakhir operator XOR (System.out.println(val1 ^ val2);). Selain itu juga dilajutkan dengan latihan di modul 4 dari 4.11.2 sampai 4.11.4

Pada tanggal 27-03-25,mengerjakan buku alamat dan entry buku alamat.

Pada Praktek Tanggal 06-03-25, mengerjakan input keyboard satu, input keyboard dua,  dan latihan modul 5. input keyboard satu yaitu menggunakan BufferedReader, sementara input keyboard dua menggunakan JOptionPane.showMessageDialog(null, msg). Mengerjakan latihan modul 5 yaitu 5111, dan 5112.

Pada Praktek tanggal 11-03-25, mengerjakan contoh yang menggunakan Break, If, loop, switch, serta Do While. Ini terdapat di modul 6 dan pengerjaanya dan pemahamannya terhadap modul tersebut.Saya juga membuat tugas di modul 6 yaitu 651, 652, 653, dan 654.

Pada Praktek tanggal 13-03-25, Pelanjutan dari modul 6 di mana kami mengerjakan latihan yang terdapat di akhir modul. Dari 6.51.1 sampai 6.54.4

Pada praktek tanggal 18-03-25, Pengerjaan modul 7 yaitu pembuatan array dan menyalin contoh pemograman dengan array di modul dan melakukan pemahaman beserta mengerjakan latihan di modul tersebut yaitu 771.1, 771.2, 772, 773.

Pada Praktek 20-03-25, kami mengerjakan modul 8 yang di mana membuat command line, latihan command line ganjil, latihan fibonachi, dan pengernjaan latihan modul 8

Pada praktek tanggal 10-04-25, melakukan pengerjaan membuat class student, person, dan student example. yang di mana belajar pewarisan.

Pada praktek tanggal 16-04-25, kami belajar tentang override yaitu menimpa (menggantikan) metode (fungsi) dari kelas induk (superclass) ke dalam kelas anak (subclass), agar perilakunya bisa berbeda sesuai kebutuhan subclass. Saya membuat kelas LSquare,Relation dan example.

Pada prektek tanggal 08-05-25, melakukan pengerjaan membuat form student dan student record.

Pada praktek tanggal 15-04-25 mengerjakan latihan serta memahami dari perngerjaan pewarisan dan class abbstrack. serta mengerjakan latihan modul 11. Saya membuatnya dalam satu package. disitu ada kelas circle,example,shape,dan square.

Pada praktek tanggal 15-04-25, lanjut memahami tentang class abstract yang di mana menggunakan shape, square, dan triangle. serta belajar relation nya.

Ada juga pengerjaan modul 10 yang packages-nya terpisah karena diajdikan tugas yaitu membuat buku alamat dan entry buku alamat

Juga sebelum UTS, 22-04-25 yaitu di package PRA_UTS, telah diberikan beberapa preview yaitu membuat clas pegawai,example yang mana barisi tentang switch dan mencari gaji pokok.

dari tanggal 20-05-25 sampai akhir sebelum UAS. Pengerjaan membuat form baik form buku, anggota, peminjaman, dan pengembalian

AnggotaDb, aplikasi ini menggunakan arsitektur MVC (Model-View-Controller) untuk mengelola data anggota yang terdiri dari atribut kode, nama, jekel, dan alamat. Bagian Model merepresentasikan struktur data anggota melalui class Anggota dengan properti privat dan metode getter-setter. DAO (Data Access Object) bertugas menyimpan dan mengelola data anggota, dalam versi ini menggunakan ArrayList sebagai penyimpanan sementara. Controller berperan sebagai penghubung antara view dan data, menangani logika saat pengguna menyimpan data melalui form. Terakhir, View dibangun menggunakan Java Swing, menampilkan form input sederhana yang memungkinkan pengguna memasukkan data anggota dan menyimpannya melalui tombol aksi.

BukuDb sebagai query SQl yang berjalan saat mendapatkan perintah dari Controller(Query SQL diletakkan didalam BukuDb. Controller adalah penghubung form dengan BukuDb. Fungsi getter akan digunakan di dalam controller untuk mengambil/get data inputan dalam form. Fungsi setter adalah untuk set data yang diperlukan untuk proses ke database.

PeminjamanDb, Aplikasi ini juga mencakup fitur pencatatan peminjaman buku dengan pendekatan arsitektur MVC. Class Peminjaman sebagai bagian dari Model menyimpan relasi antara objek Anggota dan Buku, serta informasi tanggal pinjam dan tanggal kembali. DAO Peminjaman menangani penyimpanan dan manajemen data peminjaman menggunakan struktur list. Di sisi Controller, logika pembuatan objek peminjaman dan koordinasi dengan DAO dilakukan saat pengguna menginput data melalui form. Sementara itu, View dirancang menggunakan Java Swing untuk memungkinkan pengguna memilih anggota, buku, serta mengisi tanggal peminjaman dan pengembalian dalam form yang terhubung langsung ke controller.

PengembalianDb, Fitur pengembalian buku dalam aplikasi ini juga dibangun dengan pola MVC untuk menjaga struktur dan keterpisahan tanggung jawab. Class Pengembalian sebagai bagian dari Model menyimpan data id, objek Peminjaman, tanggal dikembalikan, jumlah hari keterlambatan, serta nominal denda. DAO Pengembalian bertugas menyimpan dan mengelola daftar data pengembalian, termasuk perhitungan denda berdasarkan keterlambatan. Controller mengatur logika bisnis, seperti menghubungkan data peminjaman dengan tanggal pengembalian dan menghitung denda otomatis. Pada bagian View, form berbasis Swing memungkinkan pengguna memasukkan data pengembalian dan menampilkannya, sekaligus memproses hitung denda dengan menghubungkan input pengguna ke controller.

