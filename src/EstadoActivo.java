public class EstadoActivo implements EstadoUSuario{

    Usuario usario;

    public pedirLibro(Material material){
        if(getTieneLibro()== False){
            this.setTieneLibro(True);
            material.setEstadoMaterial(Prestado);//esta linea esta mal hasta que se haga la clase del material
        }else{
            System.out.println("No puedes pedir otro libro porque ya pediste prestado 1 libro");
        }
    }

    public devolverLibro(Material material){
        this.setTieneLIbro(False);
        material.setEstadoMaterial(Libre);//esta linea esta mal igual que la otra 
        System.out.println("Has devuelto el libro" + material.getNombre());
    }
    
    //public renovarPrestamo(Material material){
    //    if (material.getEstado() == Prestado ){
    //    
    //    }
    //}
}