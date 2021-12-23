public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Петров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Петрова";

        long ans = saveStudentOrder(so);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199L;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);

        return answer;
    }
}
