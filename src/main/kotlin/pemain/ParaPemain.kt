package pemain

class ParaPemain(pemain1: String, pemain2: String) {


    fun checkPlay(pemain1: String, pemain2: String) {
        if (pemain1 == "Gunting" && pemain2 == "Batu") {
            println("Pemain 2 Menang")
        } else if (pemain1 == "Gunting" && pemain2 == "Gunting") {
            println("Draw")
        } else if (pemain1 == "Gunting" && pemain2 == "Kertas") {
            println("Pemain 1 Menang")
        }
    }
}
