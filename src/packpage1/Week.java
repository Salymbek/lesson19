package packpage1;
public enum Week {

    MONDAY("Дуйшомбу куну technical lesson окуйм"),
    TUESDAY("Шейшемби куну англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби куну soft skills сабагын окуйм"),
    THURSDAY("Бейшемби куну session кором"),
    FRIDAY("Жума куну event ке катышам"),
    SATURDAY("Ишемби куну дем алыш"),
    SUNDAY("Жекшемби куну дем алыш");

    private String designation;

    Week(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
