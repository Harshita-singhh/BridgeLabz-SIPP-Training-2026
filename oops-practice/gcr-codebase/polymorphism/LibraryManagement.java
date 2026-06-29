class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibraryManagement {

    public static void searchMember(LibraryMember members[], String id) {

        for (LibraryMember m : members) {
            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                m.printDetails();
                return;
            }
        }

        System.out.println("\nMember Not Found");
    }

    public static void main(String[] args) {

        LibraryMember members[] = {
                new StudentMember("Harshita", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        System.out.println("Library Members\n");

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine for 5 days = ₹" + m.calculateFine(5));
            System.out.println();
        }

        searchMember(members, "F201");
    }
}