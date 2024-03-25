public class Zeropocalypse {

    // INSTANCE VARIABLE(S)
    int[] inputArray;
    int numSolutions;
    int numSolutionsToAdd;
    int testCounter;

    // CONSTRUCTOR
    public Zeropocalypse(int[] inputArray)
    {
        this.inputArray = inputArray;
        this.numSolutions = 0;
        this.numSolutionsToAdd = 0;
        this.testCounter = 0;
    }

    public int Zeropocalypse_ways()
    {
        int numBefore = 0; // in case zdro at the start of array
        int numAfter = 11; // in case zeros at end of array
        int range = 0;
        int numberOfZeroes = 0;
        boolean currentSetOfZeros = false;

        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] == 0) {
                currentSetOfZeros = true;
                numberOfZeroes++;
            }
            if (i == inputArray.length - 1) {
                if (currentSetOfZeros){
                    range = numAfter - numBefore;
                    calcCurNumSolutions(range-1, numberOfZeroes-1);
                    this.numSolutions += this.numSolutionsToAdd;
                }
                break;
            }
            if (inputArray[i+1] != 0 && currentSetOfZeros) {
                numAfter = inputArray[i+1];
                range = numAfter - numBefore;
                calcCurNumSolutions(range-1, numberOfZeroes-1);

                if (this.numSolutions == 0){
                    this.numSolutions += this.numSolutionsToAdd;
                }
                else {
                    this.numSolutions *= this.numSolutionsToAdd;
                }
                this.testCounter = 0;
                this.numSolutionsToAdd = 0;
                numberOfZeroes = 0;
                numAfter = 11; // assign back to 11, in case of zeros being at end.
                currentSetOfZeros = false;
            }

            if (!currentSetOfZeros) {
                numBefore = inputArray[i];
            }
        }
        return numSolutions;
    }
    private void calcCurNumSolutions(int range, int zeros) {
        testCounter++;

        if (zeros == 0){
            numSolutionsToAdd += range;
            return;
        }
        if (zeros == 1) {
            numSolutionsToAdd += (range - 1);
            if (range > 2) {
                calcCurNumSolutions(range - 1, zeros);
            }
            return;
        }

        calcCurNumSolutions(range - 1, zeros - 1);

        if (range - 1 == zeros) {
            return;
        }
        calcCurNumSolutions(range - 1, zeros);
    }
}