public enum StatusType {

    Teacher(1),
    seniorStudent(2),
    juniorStudent(3);


    private int priority;

    StatusType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }


}
