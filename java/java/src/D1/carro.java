public class carro {
 private String modelo;
  private String marca;
   private int cauchos;
   private String color;
  
  
public String getModelo() {
    return modelo;
  }
   public void setModelo(String modelo) {
     this.modelo = modelo;
   }
   public String getMarca() {
     return marca;
   }
   public void setMarca(String marca) {
     this.marca = marca;
   }
   public int getCauchos() {
     return cauchos;
   }
   public void setCauchos(int cauchos) {
     this.cauchos = cauchos;
   }
   public String getColor() {
     return color;
   }
   public void setColor(String color) {
     this.color = color;
   }
public void encender(){ 

  System.out.println("el carro encendio papi");

}


public carro(String modelo, String marca, int cauchos, String color) {
  this.modelo = modelo;
  this.marca = marca;
  this.cauchos = cauchos;
  this.color = color;
}
public void marcha(String x){

  System.out.println("el carro en" + x);
  
  } 

  public static void main(String[] args) {
    carro carito = new carro("aventador","lamborghini", 5, "jade");
    carito.encender();
  }
  
}