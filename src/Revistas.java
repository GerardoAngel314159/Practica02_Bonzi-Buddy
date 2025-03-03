public class Revistas extends Material{

    Revistas [] revistas;
    private int position = 0;

    public Object next();
    Revistas [] revis  = revistas[position];
    position ++;
    return revis;

    public Boolean hasNext(){
    	if(indice < doctores.length){	
   		return true;
		}
		return false;
    }

}