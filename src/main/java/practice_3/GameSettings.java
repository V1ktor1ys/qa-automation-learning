package practice_3;

/**
 * Создайте класс GameSettings с полями:
 * static int maxPlayers — общее ограничение игроков
 * final String gameName — название (нельзя менять)
 * int currentPlayers — сколько игроков в игре сейчас
 * Реализуйте конструктор, статический метод setMaxPlayers(int),
 * метод addPlayer() — добавляет 1 игрока, метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
 * В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 */
public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        this.currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("GameName: " + gameName + ", CurrentPlayes: " + currentPlayers + ", MaxPlayers: " + maxPlayers);
    }

}
