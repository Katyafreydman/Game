import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void whenFirstPlayerMoreStrength() {
        Game game = new Game();
        Player player1 = new Player(1, "Силач", 10);
        Player player2 = new Player(2, "Картошка", 5);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Силач", "Картошка");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenSecondPlayerMoreStrength() {
        Game game = new Game();
        Player player1 = new Player(1, "Силач", 10);
        Player player2 = new Player(2, "Картошка", 15);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Силач", "Картошка");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void whenPlayersStrengthEqual() {
        Game game = new Game();
        Player player1 = new Player(1, "Силач", 10);
        Player player2 = new Player(2, "Картошка", 10);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Силач", "Картошка");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenNoPlayer1() {
        Game game = new Game();
        Player player1 = new Player(1, "", 0);
        Player player2 = new Player(2, "Картошка", 10);
        game.register(player1);
        game.register(player2);

        int actual = game.round("", "Картошка");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenNoPlayers() {
        Game game = new Game();
        Player player1 = new Player(1, "", 0);
        Player player2 = new Player(2, "", 0);
        game.register(player1);
        game.register(player2);

        int actual = game.round("", "");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}