package oop_115708_DominikusDylon.Week05

fun main() {
    val dosen1 = Dosen("Joko", "23872783")
    val admin1 = Admin("Wowo")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (Pegawai in daftarPegawai){
        Pegawai.bekerja()

        when (Pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${Pegawai.nidn})")
                Pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                Pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
}