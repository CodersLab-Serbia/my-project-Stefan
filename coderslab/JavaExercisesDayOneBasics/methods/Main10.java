package pl.coderslab.JavaExercisesDayOneBasics.methods;

public class Main10 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(footballWin(0, 2, 3, 1)); // Output: "1" (Team A wins)
        System.out.println(footballWin(2, 2, 1, 1)); // Output: "X" (Draw)
        System.out.println(footballWin(1, 1, 2, 3)); // Output: "2" (Team B wins)
        System.out.println(footballWin(1, 2, 2, 1)); // Output: "1" (Team A wins)
    }

    public static String footballWin(int teamAFirst, int teamBFirst, int teamASecond, int teamBSecond) {
        int totalGoalsA = teamAFirst + teamASecond; // Total goals for Team A
        int totalGoalsB = teamBFirst + teamBSecond; // Total goals for Team B

        if (totalGoalsA > totalGoalsB) {
            return "1"; // Team A wins
        } else if (totalGoalsB > totalGoalsA) {
            return "2"; // Team B wins
        } else {
            // If total goals are tied, check away goals
            int awayGoalsA = teamASecond; // Team A's away goals
            int awayGoalsB = teamBFirst;   // Team B's away goals

            if (awayGoalsA > awayGoalsB) {
                return "1"; // Team A wins on away goals
            } else if (awayGoalsB > awayGoalsA) {
                return "2"; // Team B wins on away goals
            } else {
                return "X"; // Draw
            }
        }
    }
}