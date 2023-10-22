package baseball;

public class Output {
    private final String gameStartMessage = "숫자 야구 게임을 시작합니다.";
    private final String inputMessage = "숫자를 입력해주세요 : ";
    private final String gameEndMessage = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String restartMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    void printStartMessage() {
        System.out.println(gameStartMessage);
    }

    void printInputMessage() {
        System.out.println(inputMessage);
    }

    void printGameEndMessage() {
        System.out.println(gameEndMessage);
    }

    void printRestartMessage() {
        System.out.println(restartMessage);
    }

}