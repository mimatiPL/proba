
open class Car(var name :String = "Default_Name", var surname : String = "Default_Surname", var numOfAccidents: Int = 0,
          brand:String, model:String, yearOfProduction:Int,typeOfEngine:String,engineCapaticy:Double,enginePower:Int)
    : Vehicle(brand, model, yearOfProduction,typeOfEngine,engineCapaticy,enginePower){

    override  fun showDetails(){
        super.showDetails()
        println("owner name: $name \nowner surname: $surname \nnumber of accidents: $numOfAccidents")

    }

    open fun changeOwner(newName:String, newSurname:String){
        this.name  = newName
        this.surname  = newSurname
    }

    open fun changeNumOfAccidents (newNumOfAccidents: Int){
        this.numOfAccidents = newNumOfAccidents
    }


    open fun ocCost(){
        var podstawa = 0.0
        var odPojemnosci = 0.0

       if(typeOfEngine != "elektryczny" && typeOfEngine != "hybrydowy"
           && typeOfEngine != "benzynowy" && typeOfEngine != "diesel")
       {
        println("Niewłaściwy typ silnika \nWybierz spośród: elektryczny/hybrydowy/benzynowy/diesel" +
                "\nObliczone OC nie zależy od typu silnika")
       }

        if(typeOfEngine == "elektryczny"){
            podstawa = 100.0
        }
        else if (typeOfEngine == "hybrydowy"){
            podstawa = 150.0
        }
        else if (typeOfEngine == "benzynowy"){
            podstawa =  200.0
        }
        else if(typeOfEngine == "diesel"){
            podstawa = 250.0
        }
        if(engineCapaticy <=1.0) {odPojemnosci = 657.0}
        else if (engineCapaticy >1.0 && engineCapaticy <=1.2) { odPojemnosci = 725.0}
        else if (engineCapaticy >1.2 && engineCapaticy <=1.4) { odPojemnosci= 752.0}
        else if (engineCapaticy >1.4 && engineCapaticy <=1.6) { odPojemnosci = 763.0}
        else if (engineCapaticy >1.6 && engineCapaticy <=2.0) { odPojemnosci = 849.0}
        else if (engineCapaticy >2.0) {odPojemnosci = 1005.0}

        var oc = podstawa+odPojemnosci

        if(numOfAccidents == 0) {oc = 0.5*oc}
        else if( numOfAccidents >= 3) {oc = 1.5*oc}


        println("Wysokość OC: $oc")


    }


}