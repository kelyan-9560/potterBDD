package fr.esgi.potter;

public class CollectionsFusion {

    public int[] fusion(int[] collection1, int[] collection2){

        int sizeNew = collection1.length + collection2.length;

        int[] fusionCollections = new int[sizeNew];


        for (int i = 0; i < collection1.length; i++) {
            fusionCollections[i] = collection1[i];
        }
        for (int j = 0; j < collection2.length; j++) {
            fusionCollections[j + collection2.length + 1] = collection2[j];
        }

        return fusionCollections;
    }
}
