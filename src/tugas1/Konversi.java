package tugas1;

/**
 *
 * @Aziz Fatih Fauzi
 */
public class Konversi {
    float suhu,celcius, fahrenheit, reamur, kelvin;
    
    public Konversi(float suhu){
        this.suhu = suhu;
    }
    
    void konversi(){
        celcius = suhu;
        fahrenheit = (9*suhu)/5 + 32;
        reamur = (4*suhu)/5;
        kelvin = (float) (suhu + 273.15);
        System.out.println("Suhu dalam Celcius  : " + celcius + " C");
        System.out.println("Dalam Fahrenheit    : " + fahrenheit + " F");
        System.out.println("Dalam Reamur        : " + reamur + " R");
        System.out.println("Dalam Kelvin        : " + kelvin + " K");
        
        if(suhu >= 100){
            System.out.println("Kondisi Air Mendidih.");
        }else if(suhu <= 0){
            System.out.println("Kondisi Air Beku.");
        }else{
            System.out.println("Kondisi Air Normal.");
        }
    }
}
