import pemain.ParaPemain

class App {
    fun run(){
        printHeader()
        inputValue()
    }

    private fun printHeader(){
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun inputValue(){
        println("Masukkan Pemain 1:")
        val pemain1 = readLine()!!
        println("Masukkan Pemain 2:")
        val pemain2 = readLine()!!
        PrintCheckPlay(pemain1,pemain2)
    }

    private fun PrintCheckPlay(pemain1:String, pemain2:String){
        val paraPemain = ParaPemain(pemain1, pemain2 )
        println("Hasil Permainan = ${paraPemain.checkPlay(pemain1, pemain2)}")
        //println("Result for Minus= ${calcUtils.plus(a,b)}")
        //println("Result for Multi= ${calcUtils.multi(a,b)}")
        //println("Result for Div= ${calcUtils.div(a,b)}")
    }

    companion object{
        @JvmStatic
        fun main(args:Array<String>) {
            val app = App()
            app.run()
        }
    }
}