/**
 * Created by manaure on 17/04/2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CopyFormater {


    static void printFormatSolution(String[] args) throws Exception {
        if (args == null)
            throw new Exception("Input must not be null");


        boolean noSolutionRequired = true;

        Scanner scnr = new Scanner(System.in);
        int sizeOfDatasets = scnr.nextInt();
        scnr.nextLine();

        List<List<String>> myDataSetIdMatrix = new ArrayList<>();

        for (int i = 0; i < sizeOfDatasets; i++) {
            String stringLine = scnr.nextLine();
            String[] array = stringLine.split("\\s+");

            List<String> arrayListTemp = new ArrayList<String>();
            Collections.addAll(arrayListTemp, array);

            myDataSetIdMatrix.add(arrayListTemp);
        }

        //Start iterating everyrow.Compare each value with all other rows values.
        for (int fromId = 0; fromId < sizeOfDatasets; fromId++) {
            for (int toId = 0; toId < sizeOfDatasets; toId++) {
                //Make sure it doesnt compare to itself
                if (fromId != toId) {
                    for (int y = 0; y < myDataSetIdMatrix.get(fromId).size(); y++) {
                        String fromDataSetId = myDataSetIdMatrix.get(fromId).get(y);
                        boolean containded = false;
                        for (int w = 0; w < myDataSetIdMatrix.get(toId).size(); w++) {
                            String toDataSetId = myDataSetIdMatrix.get(toId).get(w);
                            //
                            if (fromDataSetId.equals(toDataSetId)) {
                                containded = true;
                            }
                        }
                        //If not conatied add it to optimizeiterations and print put copy references
                        if (!containded) {
                            noSolutionRequired = false;
                            myDataSetIdMatrix.get(toId).add(fromDataSetId);
                            //Index have to be added by 1 for normal  index syntax
                            System.out.println(fromDataSetId + " " + (fromId + 1) + " " + (toId + 1));
                        }

                    }


                }
            }
        }

        if (noSolutionRequired) System.out.println("");

        System.out.println("done");

        scnr.close();

    }

}
