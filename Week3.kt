fun main() {

    // 1
    val min = 200_000
    var beli = 625_000
    val diskonMember = beli * 5 / 100
    val diskonBeli = beli * 10 / 100
    var totalDiskon = diskonMember + diskonBeli

    if (beli >= min) {
        var total = beli - diskonMember - diskonBeli
        println("Pembeli 1 mendapatkan diskon 15% dari $beli, jadi totalnya : $beli - $totalDiskon = $total ")
    } else if (beli <= min) {
        var total = beli - diskonMember - diskonBeli
        println("Pembeli 1 mendapatkan diskon 5% dari $beli, jadi totalnya : $beli - $totalDiskon = $total")
    }

    // 2
    var beratBadan = 65
    var tinggiBadan = 173

    if (tinggiBadan - 110 == beratBadan){
        println("Normal")
    } else if (tinggiBadan - 100 >= beratBadan) {
        println("Gemuk")
    } else if (tinggiBadan - 100 <= beratBadan) {
        kotlin.io.println("Kurus")
    }
}