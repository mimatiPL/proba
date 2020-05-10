fun main(args: Array<String>) {
    val DefaultVehicle = Vehicle()
    DefaultVehicle.showDetails()

    val skoda = Vehicle("Skoda", "Octavia", 2009, "benzyna", 1.9, 90)
    skoda.showDetails()
    var skodaWiek = skoda.ageOfVehicle()
    println("Wiek skody to: $skodaWiek")

    val volvo = Car(
        "Wojciech",
        "Kowalski",
        0,
        "Volvo",
        "XC 40",
        2017,
        "diesel",
        1.45,
        100

    )
        volvo.changeOwner("Mateusz","Misiewicz")
        volvo.changeNumOfAccidents(1)
        volvo.showDetails()
        volvo.ocCost()


    var ciezarowka = Truck(
        23,
        "Janusz",
        "Nowak",
        0,
        "Skania",
        "Rw23",
        1999,
        "elektryczny",
        3.4,
        300
    )

    ciezarowka.changeNumOfAccidents(1)
    ciezarowka.changeOwner("Dariusz","Mleko")
    ciezarowka.showDetails()
    ciezarowka.ocCost()
    ciezarowka.kmCost(120)

}