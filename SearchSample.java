public class SearchSample {
    //public static int lineaSearch(int[] List int key) {
    //for(int i = 0;i<LIst.length;i++) {
    //if(key == LIst[i])
    //return -1;

    public static void selectionSort(double[] list) {
        for (int i=0; i<list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}



