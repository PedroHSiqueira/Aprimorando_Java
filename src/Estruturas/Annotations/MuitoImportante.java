package Estruturas.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)             // TYPE = Só pode em classes
@Retention(RetentionPolicy.RUNTIME)   // Diz que a annotation deve permanacer durante todo o Runtime
public @interface MuitoImportante {
}
