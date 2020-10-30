fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Agus coffe sedang buka"
    } else if (now == openHours){
        "Mohon tunggu, Agus coffe sedang disiapkan "
    } else {
        "Agus coffe sedang tutup"
    }
    print(office)
}
// Agus safrudin