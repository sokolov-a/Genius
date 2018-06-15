public class PhraseOMaticLesson {
    public static void main (String[] args) {
        String[] wordListOne= {"Упоротый", "Утонченный", "Обкуренный", "Обдолбанный", "Пьяный", "Торчащий"};
        String[] wordListTwo= {"Ежик", "Альбатрос", "Конь", "Енот", "Слон", "Торчок"};
        String[] wordListThree = {"Упал","Убежал","Подрался","Кусался","Царапался","Щекотался"};
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght=wordListThree.length;

        int rand1 = (int) (Math.random()*oneLenght);
        int rand2 = (int)(Math.random()*twoLenght);
        int rand3= (int)(Math.random()*threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Случилось страшное - " + phrase);
    }
}
