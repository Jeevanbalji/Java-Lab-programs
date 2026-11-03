abstract class EnergySource{
   int SourceId;
   String SourceName;
   double Energy;
   
   
   EnergySource( int SourceId,String SourceName,double Energy)
   {
      this.SourceId=SourceId;
      this.SourceName=SourceName;
      this.Energy=Energy;
   }
   
   abstract void CalculateEfficiency();
   
   void display(){
   System.out.println("source"+SourceId);
   System.out.println("Name"+SourceName);
   System.out.println("ENergy"+Energy);
      }
   
   }
 class SolarEnergy extends EnergySource{
   SolarEnergy(int SourceId, String SourceName,double Energy){
      super(SourceId,SourceName,Energy);
   }
   
   
   void CalculateEfficiency(){
      System.out.println("Efficiency"+(Energy/5000)*100);
    }
    }
  class WindEnergy extends EnergySource{
  WindEnergy(int SourceId,String SourceName,double Energy){
   super(SourceId,SourceName,Energy);
  }
  
  
   void CalculateEfficiency(){
    System.out.println("Efficiency"+(Energy/8000)*100);
    }
    }
    
   public class Energy{
      public static void main(String[]args){
   EnergySource e;
   e=new SolarEnergy(101,"Solar",10000);
   e.display();
   e.CalculateEfficiency();
   
   e=new WindEnergy(102,"Wind",30000);
   e.display();
   e.CalculateEfficiency();  
   }
}
  