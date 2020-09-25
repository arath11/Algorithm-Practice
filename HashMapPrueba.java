import java.util.Collection;
import java.util.HashMap;

public class HashMapPrueba {
    private HashMap<Integer,String> hashMap;


    public void HashMapPrueba() {
        this.hashMap=new HashMap<>();
    }

    public void getHashMapPrueba(int size) {
        this.hashMap=new HashMap<>(size);
    }

    public void añadir(int key, String data){
        hashMap.put(key,data);
    }

    public void exits(int key){
        if(hashMap.containsKey(key)){
            System.out.println("With this key " + key + " returns: " + hashMap.get(key));
        }else {
            System.out.println("No existen coincidencias ");
        }
    }

        public void imprimir(){
            for(int i : hashMap.keySet()){
                System.out.println("Key "+i+" value: "+ hashMap.get(i));
            }

        }



    public static void main(String[] args) {
        HashMapPrueba prueba=new HashMapPrueba();
        prueba.HashMapPrueba();

        prueba.añadir(20100,"Fireworks");
        prueba.añadir(20100,"Adios amor");

        prueba.añadir(20100,"Ajua");
        prueba.añadir(100100,"No type ");

        prueba.imprimir();
        //prueba.exits(20100);
    }
}
