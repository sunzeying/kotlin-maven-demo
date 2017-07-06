package T10.ktJava.k2;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by apple on 17/4/21.
 */
public abstract class NullSafetyAbsClass {

    public abstract String formatDate(Date date);

//    public String formatTime(Date date) {
//        return new SimpleDateFormat("HH:mm:ss").format(date);
//    }

    public @NotNull
    String formatTime(@NotNull Date date) {
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }
}
