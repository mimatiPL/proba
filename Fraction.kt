
class Fraction(var licznik:Int = 1, var mianownik: Int = 1) {

    constructor(licznik: Int) : this(licznik, mianownik = 1)
    init{
        if (mianownik==0)
            throw ArithmeticException("MIANOWNIK MA BYC ROZNY OD ZERA")
    }
    //zad1
    fun fractionToString(): String {

        var licznik = this.licznik
        var mianownik = this.mianownik
        return "$licznik/$mianownik"

    }

    //zad2
    fun NWD (a: Int, b: Int): Int{
        var a = a
        var b = b
        while (a != b){
            if (a>b) {
                a = a - b
            }
                else {b -= a }
                    }
        return a

    }
    fun reduce(u1: Fraction): Fraction{

        var newFraction : Fraction = Fraction()
        var maxDzielnik: Int = NWD(u1.licznik,u1.mianownik)
        newFraction.licznik = u1.licznik/maxDzielnik
        newFraction.mianownik = u1.mianownik/maxDzielnik

        return newFraction
    }

    //zad3
    fun quot(u1: Fraction, u2: Fraction): Fraction {

        var NewFraction: Fraction = Fraction()
        NewFraction.licznik = u1.licznik * u2.licznik
        NewFraction.mianownik = u1.mianownik * u2.mianownik
        return NewFraction
    }

    fun NajmniejszyMianownik(a: Int, b: Int): Int {
        var i = 2
        do {
            i++}
        while(i%a != 0 || i%b != 0)
        return i

    }


    //zad4
    fun add(u1: Fraction, u2: Fraction): Fraction {


        var NewFraction = Fraction()
        if (u1.mianownik == u2.mianownik) {
            NewFraction.licznik = u1.licznik + u2.licznik
            NewFraction.mianownik = u2.mianownik
        } else {
            NewFraction.mianownik = NajmniejszyMianownik(u1.mianownik, u2.mianownik)
            var nowylicznik1 = (NewFraction.mianownik / u1.mianownik) * u1.licznik
            var nowylicznik2: Int = (NewFraction.mianownik / u2.mianownik) * u2.licznik
            NewFraction.licznik = nowylicznik1 + nowylicznik2
        }

        return NewFraction

    }
    //zad5
    fun Inv(u1: Fraction): Fraction {
        var newFraction: Fraction = Fraction(-u1.licznik, u1.mianownik)
        return newFraction
    }
    fun Reverse(u1: Fraction): Fraction{

        var newFraction: Fraction = Fraction(u1.mianownik, u1.licznik)
        return  newFraction
    }
}


