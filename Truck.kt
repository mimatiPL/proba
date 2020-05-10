class Truck (val towingCapaticy: Int = 1, name: String, surname: String, numOfAccidents: Int, brand: String,
             model: String, yearOfProduction: Int, typeOfEngine: String, engineCapaticy: Double, enginePower: Int)
    : Car(name, surname, numOfAccidents, brand, model, yearOfProduction, typeOfEngine, engineCapaticy, enginePower) {


    override fun showDetails() {
        super.showDetails()
        println("towing Capaticy: $towingCapaticy")
    }

    override fun changeOwner(newName: String, newSurname: String) {
        super.changeOwner(newName, newSurname)
    }

    override fun changeNumOfAccidents(newNumOfAccidents: Int) {
        super.changeNumOfAccidents(newNumOfAccidents)
    }

    override fun ocCost() {
        var podstawa = 0.0
        var odPojemnosci = 0.0
        var odLadownosci = 0.0

        if (typeOfEngine != "elektryczny" && typeOfEngine != "hybrydowy"
            && typeOfEngine != "benzynowy" && typeOfEngine != "diesel"
        ) {
            println(
                "Niewłaściwy typ silnika \nWybierz spośród: elektryczny/hybrydowy/benzynowy/diesel" +
                        "\nObliczone OC nie zależy od typu silnika"
            )
        }

        if (typeOfEngine == "elektryczny") {
            podstawa = 1000.0
        } else if (typeOfEngine == "hybrydowy") {
            podstawa = 1500.0
        } else if (typeOfEngine == "benzynowy") {
            podstawa = 2000.0
        } else if (typeOfEngine == "diesel") {
            podstawa = 2500.0
        }
        if (engineCapaticy <= 1.0) {
            odPojemnosci = 1657.0
        } else if (engineCapaticy > 1.0 && engineCapaticy <= 1.2) {
            odPojemnosci = 1725.0
        } else if (engineCapaticy > 1.2 && engineCapaticy <= 1.4) {
            odPojemnosci = 1752.0
        } else if (engineCapaticy > 1.4 && engineCapaticy <= 1.6) {
            odPojemnosci = 1763.0
        } else if (engineCapaticy > 1.6 && engineCapaticy <= 2.0) {
            odPojemnosci = 1849.0
        } else if (engineCapaticy > 2.0) {
            odPojemnosci = 2005.0
        }
        if(towingCapaticy <=2){
            odLadownosci = 100.0
        }else if(towingCapaticy >2 && towingCapaticy <=6){
            odLadownosci = 200.0
        }else if (towingCapaticy >6 && towingCapaticy <= 9 ){
            odLadownosci = 400.0
        }else if (towingCapaticy >9 && towingCapaticy <= 12 ) {
            odLadownosci = 700.0
        }else if (towingCapaticy > 12 ) {
            odLadownosci = 1000.0
        }
        var oc = podstawa + odPojemnosci + odLadownosci

        if (numOfAccidents == 0) {
            oc = 0.5 * oc
        } else if (numOfAccidents >=3) {
            oc = 1.5 * oc
        }


        println("Wysokość OC: $oc")
    }


    fun kmCost (km :Int){
        var a: Double = 0.0
        if(towingCapaticy <=2){
            a = (0.03* km) + (0.5* towingCapaticy)
        }else if(towingCapaticy >2 && towingCapaticy <=6){
            a = (0.1* km) + (0.5* towingCapaticy)
        }else if (towingCapaticy >6 && towingCapaticy <= 9 ){
            a = (0.3* km) + (0.5* towingCapaticy)
        }else if (towingCapaticy >9 && towingCapaticy <= 12 ) {
            a = (0.5* km) + (0.5* towingCapaticy)
        }else if (towingCapaticy > 12 ) {
            a = (0.5 * km) + (0.5 * towingCapaticy)
        }

        println("Koszt przejechania $km-owej trasy autostradą wynosi: $a zł.")

    }

}