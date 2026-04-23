package br.com.dio;

import br.com.dio.model.Board;
import br.com.dio.model.Space;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static br.com.dio.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toMap;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static  int BOARD_LIMIT = 9;

    public static void main(String[] args){
        final var positions = Stream.of(args).collect(toMap(
                k -> k.split(";")[0],
                v -> v.split(";")[0]
        ));

        var option = -1;
        while(true){
            System.out.println("Selecione uma das opções a seguir:");
            System.out.println("1 - Iniciar um novo jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option){
                case 1 -> stratGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 ->   System.exit(0);
                default -> System.out.println("Opção invalida");
            }
        }
    }

    private static void stratGame(Map<String, String> positions) {
        if(nonNull(board)){
            System.out.println("Jogo iniciado");
            return;
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var CurrentSpace = new Space(expected, fixed);
                spaces.get(i).add(CurrentSpace);
            }
        }

        board = new Board(spaces);
        System.out.println("Jogo Pronto");
    }

    private static void inputNumber() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna que o número sera inserido");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha que o número sera inserido");
        var row = runUntilGetValidNumber(0,8);
        System.out.printf("Informe o número que sera inserido na posição [%s,%s] \n",col,row);
        var value = runUntilGetValidNumber(1,9);

        if(!board.changeValue(col , row , value)){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n",col,row);
        }

    }

    private static void removeNumber() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna que o número sera inserido");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha que o número sera inserido");
        var row = runUntilGetValidNumber(0,8);
        if(!board.clearValue(col , row)){
            System.out.printf("A posição [%s,%s] foi limpada\n",col,row);
        }
    }

    private static void showCurrentGame() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        var args = new Object[81];
        var argsPos = 0;
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for(var col: board.getSpaces()){
                args[argsPos ++] = " " + (isNull(col.get(i).getActual()) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("Seu jogo:");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        System.out.printf("O jogo se encontra atualmente no status %s\n",board.getStatus().getLabel());

        if(board.hasErros()){
            System.out.println("Contem Erros");
        }
        else{
            System.out.println("Não Contem Erros");
        }
    }

    private static void clearGame() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        System.out.println("Quer realmente apagar?");
        var confirm = scanner.next();
        while(!confirm.equalsIgnoreCase("sim") || !confirm.equalsIgnoreCase("não")){
            System.out.println("Informe 'sim' ou 'não' ");
            confirm = scanner.next();
        }
        if(confirm.equalsIgnoreCase("sim")){
            board.reset();
        }

    }


    private static void finishGame() {
        if(isNull(board)){
            System.out.println("Jogo não foi iniciado");
            return;
        }

        if(board.gameIsFinished()){
            System.out.println("O Jogo finalizou");
            showCurrentGame();
            board = null;
        } else if (board.hasErros()) {
            System.out.println("Seu jogo tem Erros");
        } else{
            System.out.println("Falta algum espaço");
        }
    }



    private static int runUntilGetValidNumber(final int min,final int max){
        var current = scanner.nextInt();
        while(current < min || current > max){
            System.out.printf("Informe um numero entre %s e %s\n",min,max);
            current = scanner.nextInt();
        }
        return current;
    }


}