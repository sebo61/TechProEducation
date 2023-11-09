package suleymanHocaJava.day38enumsiterators;

import java.util.Arrays;

public enum UsStatesEnum {

    ALASKA  ("ALASKA", "AK", "Juneau"),
    ARIZONA  ("ARIZONA", "AZ", "Phoenix"),
    ARKANSAS  ("ARKANSAS", "AR", "Little Rock"),
    CALIFORNIA  ("CALIFORNIA", "CA", "Sacramento"),
    COLORADO  ("COLORADO", "CO", "Denver"),
    CONNECTICUT  ("CONNECTICUT", "CT", "Hartford"),
    DELAWARE  ("DELAWARE", "DE", "Dover"),
    FLORIDA  ("FLORIDA", "FL", "Tallahassee"),

    GEORGIA  ("GEORGIA", "GA", "Atlanta"),
    HAWAII  ("HAWAII", "HI", "Honolulu"),
    IDAHO  ("IDAHO", "ID", "Boise"),
    INDIANA  ("INDIANA", "IN", "Indianapolis"),
    IOWA  ("IOWA", "IA", "Des Moines"),
    KANSAS  ("KANSAS", "KS", "Topeka"),
    KENTUCKY  ("KENTUCKY", "KY", "Frankfort"),
    LOUISIANA  ("LOUISIANA", "LA", "Baton Rouge"),
    MAINE  ("MAINE", "ME", "Augusta"),
    MARYLAND  ("MARYLAND", "MD", "Annapolis"),
    MASSACHUSETTS  ("MASSACHUSETTS", "MA", "Boston"),
    MICHIGAN  ("MICHIGAN", "MI", "Lansing"),
    MINNESOTA  ("MINNESOTA", "MN", "Saint Paul"),
    MISSISSIPPI  ("MISSISSIPPI", "MS", "Jackson"),
    MISSOURI  ("MISSOURI", "MO", "Jefferson City"),
    MONTANA  ("MONTANA", "MT", "Helena"),
    NORTH_CAROLINA  ("NORTH CAROLINA", "NC", "Raleigh"),
    NORTH_DAKOTA  ("NORTH DAKOTA", "ND", "Bismarck"),
    OHIO  ("OHIO", "OH", "Columbus"),
    OKLAHOMA  ("OKLAHOMA", "OK", "Oklahoma City"),
    OREGON  ("OREGON", "OR", "Salem"),
    PENNSYLVANIA  ("PENNSYLVANIA", "PA", "Harrisburg"),
    RHODE_ISLAND  ("RHODE ISLAND", "RI", "Providence"),
    SOUTH_CAROLINA  ("SOUTH CAROLINA", "SC", "Columbia"),
    SOUTH_DAKOTA  ("SOUTH DAKOTA", "SD", "Pierre"),
    TENNESSEE  ("TENNESSEE", "TN", "Nashville"),
    TEXAS  ("TEXAS", "TX", "Austin"),
    UTAH  ("UTAH", "UT", "Salt Lake City"),
    VERMONT  ("VERMONT", "VT", "Montpelier"),
    VIRGINIA  ("VIRGINIA", "VA", "Richmond"),
    WASHINGTON  ("WASHINGTON", "WA", "Olympia"),
    WEST_VIRGINIA  ("WEST VIRGINIA", "WV", "Charleston"),
    WISCONSIN  ("WISCONSIN", "WI", "Madison"),
    WYOMING  ("WYOMING", "WY", "Cheyenne");

    private final String stateName;
    private final String abbreviation;
    private  final String capital;

    UsStatesEnum(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }
    // state kısaltmasını verince state ın ismini veren method
    public static String getStateNameByUsingAbbreviation(String abbreviation){
        return Arrays.stream(values())
                .filter(usState -> usState.getAbbreviation().equals(abbreviation))
                .findFirst().get().getStateName();
    }
    public static String getAbbreviationForStateName(String stateName){
        return Arrays.stream(values())
                .filter(usState -> usState.getStateName().equals(stateName))
                .findFirst().get().getAbbreviation();
    }

}
