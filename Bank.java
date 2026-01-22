class Bank{
    public float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank{
    float rate = 8;

    @Override
    public float getRateOfInterest(){
        return rate;
    }
}

class ICICI extends Bank{
    float rate = 7;

    @Override
    public float getRateOfInterest(){
        return rate;
    }
}

class AXIS extends Bank{
    float rate = 9;

    @Override
    public float getRateOfInterest(){
        return rate;
    }
}

//Solución correcta y simplificada: (el main TestBank.java es correcto)

// class Bank {
//    public float getRateOfInterest() {
//        return 0;
    }
}

//class SBI extends Bank {
//    @Override
//   public float getRateOfInterest() {
//        return 8.0f; // Directamente devuelve el valor
    }
}

//class ICICI extends Bank {
//    @Override
//    public float getRateOfInterest() {
//        return 7.0f;
    }
}

//class AXIS extends Bank {
//    @Override
//    public float getRateOfInterest() {
//        return 9.0f;
    }
}