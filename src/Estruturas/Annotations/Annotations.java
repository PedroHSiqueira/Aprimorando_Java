package Estruturas.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //Annotation para eleminar avisos
        @SuppressWarnings("unused")
        Corredor corredor = new Corredor("Katagiri Kanata", "Toyota GT86");

        // Ver se a annotation está presente na classe
        if(corredor.getClass().isAnnotationPresent(MuitoImportante.class)){
            System.out.println("É muito importante");
        }else{
            System.out.println("Não é importante");
        }

        for(Method metodo : corredor.getClass().getDeclaredMethods()){
            if (metodo.isAnnotationPresent(Instantaneo.class)){
                Instantaneo annotation = metodo.getAnnotation(Instantaneo.class);
                for (int i = 0; i < annotation.vezes(); i++){
                    metodo.invoke(corredor);
                }
            }
        }
    }
}
