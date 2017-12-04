package zhujie;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by alibeibei on 2017/12/4.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();

    int val();
}
