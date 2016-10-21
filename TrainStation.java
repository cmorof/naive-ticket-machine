
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
    private MaquinaTiquet maquina1;
    private MaquinaTiquet maquina2;
    private int totalDinero;

    public TrainStation()
    {
        maquina1 = new MaquinaTiquet(300);
        maquina2 = new MaquinaTiquet(200);
        totalDinero = 0;
    }
  
    public void imprimirTotalDinero()
    {
        totalDinero = maquina1.obtenerTotal();
        totalDinero = totalDinero + maquina2.obtenerTotal();
        System.out.println(totalDinero);
    }
   
    public void ImprimirBillete()
    {
        maquina1.insertarDinero(200);
        maquina1.imprimirTiquet();
        maquina2.insertarDinero(300);
        maquina2.imprimirTiquet();
    }
}