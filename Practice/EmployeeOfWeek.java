public class EmployeeOfWeek {
    static void  solve(int[][] day){
        int sum = 0, max=0;
        // the employee who will get maximum rating will be the employe of the day
        for(int i = 0; i<day.length; i++){
            for(int j = 1; j<day[i].length; j++){
                sum += day[i][j];
            }
            if(sum > max){
                max = sum;
                System.out.println(day[i][0]);
            }
        }
    }

    // input will be taken in the format of [["peter parker',6,3,4]]
}
