public class EstadoActivo implements EstadoUSuario{

    Usuario usario;

    public void pedirLibro(Material material){
        if(getTieneLibro()== False){
            this.setTieneLibro(True);
            material.setEstaLibre(False);
            //linea que es por 15 dias 
        }else{
            System.out.println("No puedes pedir otro libro porque ya pediste prestado 1 libro");
        }
    }

    public void devolverLibro(Material material){
        this.setTieneLIbro(False);
        material.setEstaLibre(True);
        System.out.println("Has devuelto el libro" + material.getNombre());
    }
    
    //public void renovarPrestamo(Material material){
    //    if (material.getEstado() == Prestado ){
    //    
    //    }
    //}

    public void prestamoExpress(Material material){
         if(getTieneLibro()== False){
        this.setTieneLibro(True);
        material.setEstaLibre(False);
        //linea que solo es por 7 dias 
        }else{
            System.out.println("No puedes pedir otro libro porque ya pediste prestado 1 libro");
        }
    }
}