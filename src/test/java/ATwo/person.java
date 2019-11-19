package ATwo;

public class person {
   float height;
   float weight;

   public person (float height,float weight)
   {
       this.height=height;
       this.weight=weight;
   }

   public float bbmi()
   {
       float bbmi = weight/(height*height);
       return bbmi;
   }
}

