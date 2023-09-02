package exercicio2;

public class Manobrista {
    public static void main (String[] args)  {
        LandRover landRover = new LandRover();
        Porsche porsche = new Porsche();
        Yamaha yamaha = new Yamaha();

        try {
            for (int i = 0; i < 10; i++) {
                landRover.acelerar();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            yamaha.setPassageiros(4);
            porsche.setPassageiros(7);
            landRover.setPassageiros(2);
        }catch (Exception e){
            e.printStackTrace();
        }





    }
}
