// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
// если было введено "abc cde def", то должно быть выведено "abcdef".

package part2.task7;

class Task7 {
    private StringBuilder basicString = new StringBuilder(" abc cde def ");

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        char temp ;
        int i = 0;

        while (i < task7.basicString.length()){
            if (task7.basicString.charAt(i) == ' '){
                task7.basicString.delete(i, i+1);
                continue;
            }
            temp = task7.basicString.charAt(i);
            for (int j=i+1; j<task7.basicString.length(); j++){
                if (task7.basicString.charAt(j) == temp){
                    task7.basicString.delete(j, j+1);
                }
            }
            i++;
        }
        System.out.println(task7.basicString);
    }
}
