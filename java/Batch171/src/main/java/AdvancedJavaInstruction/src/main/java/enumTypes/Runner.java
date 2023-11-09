package enumTypes;

import java.sql.SQLOutput;

import static enumTypes.PasswordStrengthConstant.*;
import static enumTypes.PasswordStrengthConstant.HIGH;

public class Runner {
    public static void main(String[] args) {
        useConstant("LOW");
        useConstant("HIGH");
        useConstant("medium"); // CTE yok , RTE yok
        System.out.println("-------------enum---------------");
        //------------------------------
        useEnum(PasswordStrengthEnum.LOW);
        useEnum(PasswordStrengthEnum.MEDIUM);
        /*useEnum(PasswordStrengthEnum.high);
        useEnum("high");
        useEnum();
        useEnum(123);
        // sadece sınırlı değerler olan enumları kullanmaya zorluyor.
*/
    }

    public static void useConstant(String strength) {
        switch (strength) {
            case LOW:
                System.out.println("password gücünüz düşüktür");
                break;
            case MEDIUM:
                System.out.println("password gücünüz orta seviyede");
                break;
            case HIGH:
                System.out.println("password gücünüz yüksek");
                break;

        }

    }

    public static void useEnum(PasswordStrengthEnum strength) {
        switch (strength) {
            case LOW:
                System.out.println("password gücünüz düşüktür");
                System.out.println("seviye:"+strength.getLevel());
                break;
            case MEDIUM:
                System.out.println("password gücünüz orta seviyede");
                break;
            case HIGH:
                System.out.println("password gücünüz yüksek");
                break;
        }
        System.out.println("enum ismi: "+strength.name());
        System.out.println("enum: "+strength.ordinal());
    }
}