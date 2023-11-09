package suleymanHocaJava.day38enumsiterators;

import com.sun.tools.javac.Main;

public class EnumRunner {
    public static void main(String[] args) {
       String capitalOfIllinois= UsStatesEnum.INDIANA.getCapital();
        System.out.println(capitalOfIllinois);

        String abbreviation= UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviation);

        System.out.println(UsStatesEnum.ALASKA);

        String stateName= UsStatesEnum.getStateNameByUsingAbbreviation("AK");

        System.out.println(stateName);


    }
}
