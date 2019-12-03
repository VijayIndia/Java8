package com.durga.lambda.collectioncomparatorinterface;
import com.durga.lambda.collectioncomparatorinterface.collections.ListWithAndWithoutLambda;
import com.durga.lambda.collectioncomparatorinterface.collections.MapWithAndWithoutLambda;
import com.durga.lambda.collectioncomparatorinterface.collections.SetWithAndWithoutLambda;
import com.durga.lambda.collectioncomparatorinterface.collections.customsorting.CustomSortingWithAndWithoutLambda;
import com.durga.lambda.collectioncomparatorinterface.impl.ComparatorImplementation;

public class LambdaComparatorService {
    private ListWithAndWithoutLambda listWithAndWithoutLambda;
    private SetWithAndWithoutLambda setWithAndWithoutLambda;
    private MapWithAndWithoutLambda mapWithAndWithoutLambda;
    private CustomSortingWithAndWithoutLambda customSortingWithAndWithoutLambda;

    public void printComparatorInterfaceWithAndWithoutLambda(){
        System.out.println("----------------------------------------Lambda : Comparator Interface starts----------------------------------------\n");
        listWithAndWithoutLambda.printListSortingWithAndWithoutLambda();
        setWithAndWithoutLambda.printSetSortingWithAndWithoutLambda();
        mapWithAndWithoutLambda.printUsingMapComparator();
        customSortingWithAndWithoutLambda.printSortbyEmployeeId();
        System.out.println("----------------------------------------Lambda : Comparator Interface ends----------------------------------------\n");
    }

    public void setListWithAndWithoutLambda(ListWithAndWithoutLambda listWithAndWithoutLambda) {
        this.listWithAndWithoutLambda = listWithAndWithoutLambda;
    }

    public void setSetWithAndWithoutLambda(SetWithAndWithoutLambda setWithAndWithoutLambda) {
        this.setWithAndWithoutLambda = setWithAndWithoutLambda;
    }

    public void setMapWithAndWithoutLambda(MapWithAndWithoutLambda mapWithAndWithoutLambda) {
        this.mapWithAndWithoutLambda = mapWithAndWithoutLambda;
    }

    public void setCustomSortingWithAndWithoutLambda(CustomSortingWithAndWithoutLambda customSortingWithAndWithoutLambda) {
        this.customSortingWithAndWithoutLambda = customSortingWithAndWithoutLambda;
    }
}
