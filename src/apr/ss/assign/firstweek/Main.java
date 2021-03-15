package apr.ss.assign.firstweek;

import apr.ss.assign.firstweek.dayfive.arrayfilter.InitiateStringArrayFilter;
import apr.ss.assign.firstweek.dayfive.arrayjoin.InitiateIntegerArrayJoin;
import apr.ss.assign.firstweek.dayfive.basiclambdas.InitiateBasicLambdaClass;
import apr.ss.assign.firstweek.dayfive.dateapi.DateAPIPlay;
import apr.ss.assign.firstweek.dayfour.consumerproducer.InitializeTransaction;
import apr.ss.assign.firstweek.dayfour.deadlock.DeadlockClass;
import apr.ss.assign.firstweek.dayone.randnum.InitializeGuessNumber;
import apr.ss.assign.firstweek.dayone.starpattern.InitializeStarPatterns;
import apr.ss.assign.firstweek.daythree.charlookup.InitializeCharLookup;
import apr.ss.assign.firstweek.daythree.fileappend.InitializeFileAppendInput;
import apr.ss.assign.firstweek.daythree.filelist.InitializeFileList;
import apr.ss.assign.firstweek.daytwo.maxindex.Initialize2DArrayFinder;
import apr.ss.assign.firstweek.daytwo.shapes.InitializeShapes;
import apr.ss.assign.firstweek.daytwo.sum.InitializeSum;
import apr.ss.assign.firstweek.inputhandler.IntInputHandler;
import apr.ss.assign.firstweek.inputhandler.StringInputHandler;
import apr.ss.assign.firstweek.weekend.doubleint.DoubleIntList;
import apr.ss.assign.firstweek.weekend.lbdop.InitializeLambdaOperations;
import apr.ss.assign.firstweek.weekend.recursion.SumClump;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO: Collect all previous homework and make a selection of which to run.
        IntInputHandler inputHandler = new IntInputHandler() {
            @Override
            protected Integer getMin() {
                return 1;
            }

            @Override
            protected Integer getMax() {
                return 17;
            }

            @Override
            public void handler() {
            }
        };

        System.out.println("Select a project to run");
        System.out.println(
                "[1]" + "D1 Star Patterns" + "\n" +
                "[2]" + "D1 Random Number Guesser" + "\n" +
                "[3]" + "D2 Find Index of Biggest Number" + "\n" +
                "[4]" + "D2 Shapes" + "\n" +
                "[5]" + "D2 Sum Finder" + "\n" +
                "[6]" + "D3 File Char Finder" + "\n" +
                "[7]" + "D3 File Append String" + "\n" +
                "[8]" + "D3 File Tree" + "\n" +
                "[9]" + "D4 Consumer Producer Thread" + "\n" +
                "[10]" + "D4 Deadlock" + "\n" +
                "[11]" + "D5 Array Filter" + "\n" +
                "[12]" + "D5 Array Join" + "\n" +
                "[13]" + "D5 Basic Lambdas" + "\n" +
                "[14]" + "D5 Date API Practices" + "\n" +
                "[15]" + "W Double Int Array" + "\n" +
                "[16]" + "W Lambda Operations" + "\n" +
                "[17]" + "W Clump Sum Recursion" + "\n"
        );

        int input = inputHandler.getInput();

        switch (input){
            case 1:
                new InitializeStarPatterns();
                break;
            case 2:
                new InitializeGuessNumber();
                break;
            case 3:
                new Initialize2DArrayFinder();
                break;
            case 4:
                new InitializeShapes();
                break;
            case 5:
                new InitializeSum();
                break;
            case 6:
                new InitializeCharLookup();
                break;
            case 7:
                new InitializeFileAppendInput();
                break;
            case 8:
                new InitializeFileList();
                break;
            case 9:
                new InitializeTransaction();
                break;
            case 10:
                new DeadlockClass();
                break;
            case 11:
                new InitiateStringArrayFilter();
                break;
            case 12:
                new InitiateIntegerArrayJoin();
                break;
            case 13:
                new InitiateBasicLambdaClass();
                break;
            case 14:
                new DateAPIPlay();
                break;
            case 15:
                System.out.println(DoubleIntList.doubleList(Arrays.asList(2,56,78,23,45)));
                break;
            case 16:
                new InitializeLambdaOperations();
                break;
            case 17:
                Integer[] group = {2,4,8};
                System.out.println(SumClump.groupSumClump(0, group, 10));
                break;
            default:
                break;
        }
    }

}
