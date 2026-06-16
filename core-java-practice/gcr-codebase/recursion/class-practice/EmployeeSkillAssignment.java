import java.util.ArrayList;

public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int index,
            int target,
            ArrayList<Integer> currentTeam) {

        // Base case
        if (target == 0) {
            System.out.println(currentTeam);
            return;
        }

        if (index == skills.length || target < 0) {
            return;
        }

        // Include current employee
        currentTeam.add(skills[index]);
        findTeams(skills, index + 1,
                  target - skills[index],
                  currentTeam);

        // Backtrack
        currentTeam.remove(currentTeam.size() - 1);

        // Exclude current employee
        findTeams(skills, index + 1,
                  target,
                  currentTeam);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, new ArrayList<>());
    }
}