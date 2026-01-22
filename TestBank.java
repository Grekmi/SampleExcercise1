// Clase de prueba
public class TestBank {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        
        System.out.println("SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS: " + axis.getRateOfInterest() + "%");
    }
}