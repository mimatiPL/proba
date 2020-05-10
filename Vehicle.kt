open class Vehicle(val brand: String = " default", val model: String = "deafult_model",
                   val yearOfProduction: Int = 2000, var typeOfEngine: String ="benzynowy",
                   var engineCapaticy: Double = 1.0, var enginePower: Int = 1){


    open fun showDetails(){
        println( "VEHICLE DETAILS:\nbrand: $brand \nmodel: $model \nyear of production: $yearOfProduction  " +
                "\ntype: $typeOfEngine \nengine Capaticy: $engineCapaticy \nengine power: $enginePower")
    }

    open fun ageOfVehicle():Int {
        var age = 2020 - yearOfProduction
        return age
    }

}