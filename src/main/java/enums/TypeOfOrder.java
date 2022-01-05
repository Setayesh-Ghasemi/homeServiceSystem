package enums;

public enum TypeOfOrder {
    WAITING_FOR_EXPERT_SUGGESTION("waitingForExpertSuggestions"),
    WAITING_FOR_SPECIALIST_SELECTION("waitingForSpecialistSelection"),
    WAITING_FOR_THE_SPECIALIST_COME("waitingForThSpecialistCome"),
    STARTED("started"),
    DONE("done"),
    PAID("paid");

    private String abbr;

    public String getAbbr() {
        return abbr;
    }

    TypeOfOrder(String abbr) {
        this.abbr = abbr;
    }
}
