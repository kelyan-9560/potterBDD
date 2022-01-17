public class Potter {

    public Potter() {}

    public double price(int[] shoppingBasket) {

        int[] countOfBooksArray = {0, 0, 0, 0, 0};

        if (shoppingBasket == null)
            return 0;

        if (shoppingBasket.length == 1)
            return 8;

        for (int book : shoppingBasket){
            countOfBooksArray[book] += 1;
        }

        int maxCount = 0;

        for (int bookCount : countOfBooksArray){

            if (bookCount > maxCount)
                maxCount = bookCount;
        }

        int[][] arrayMatrix = new int[5][];

        for (int rowIndex = 0; rowIndex < arrayMatrix.length; rowIndex++)
        {

            arrayMatrix[rowIndex] = new int[maxCount];

            int bookCountIndex = countOfBooksArray[rowIndex] - 1;

            for (int colunmIndex = 0; colunmIndex < maxCount; colunmIndex++)
            {
                if (colunmIndex <= bookCountIndex) {
                    arrayMatrix[rowIndex][colunmIndex] = rowIndex;
                } else {
                    arrayMatrix[rowIndex][colunmIndex] = -1;
                }
            }
        }

        double totalSum = 0;

        boolean previousColumn5 = false;

        for (int colunmIndex = 0; colunmIndex < maxCount; colunmIndex++)
        {
            double sumOfColumn = 0;

            double sumOfNextColumn = 0;

            for (int rowIndex = 0; rowIndex < arrayMatrix.length; rowIndex++)
            {
                if (arrayMatrix[rowIndex][colunmIndex] > -1) {
                    sumOfColumn += 1;
                }

                int nextColumnIndex = maxCount -1;

                if ( colunmIndex < nextColumnIndex) {

                    if (arrayMatrix[rowIndex][colunmIndex + 1] > -1) {
                        sumOfNextColumn += 1;
                    }
                }
            }

            if ((sumOfColumn == 5)  && (sumOfNextColumn == 3)) {
                previousColumn5 = true;

                totalSum += (4 * 8 * 0.8) + (4 * 8 * 0.8);

            } else if (sumOfColumn == 5)  {
                totalSum += (5 * 8 * 0.75);
            }
            else if (sumOfColumn == 4)  {
                totalSum += (4 * 8 * 0.8);
            }
            else if (sumOfColumn == 3)  {
                if (!previousColumn5)
                    totalSum += (3 * 8 * 0.90);
                else
                    previousColumn5 = false;
            }
            else if (sumOfColumn == 2)  {
                totalSum += (2 * 8 * 0.95);
            }
            else if (sumOfColumn == 1)  {
                totalSum += 8;
            }
        }
        return totalSum;
    }

}