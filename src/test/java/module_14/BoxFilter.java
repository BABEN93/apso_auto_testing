package module_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoxFilter {

    List<Box> boxes = new ArrayList<>();

    private List<Box> boxesMinimumSize(){
        boxes.add(new Box(15,5,5));
        boxes.add(new Box(32,18,8));
        boxes.add(new Box(40,20,15));
        return boxes;
    }
    private List<Box> boxesMediumSize(){
        boxes.add(new Box(50,25,15));
        boxes.add(new Box(55,30,20));
        boxes.add(new Box(60,35,30));
        return boxes;
    }
    private List<Box> boxesWithSize(){
        boxes.add(new Box(70,45,45));
        boxes.add(new Box(65,50,50));
        boxes.add(new Box(80,55,60));
        return boxes;
    }

    public static void filterWideBoxes(int wide, List<Box> source, List<Box> destination) {
        Iterator<Box> iterator = source.iterator();

        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > wide) {
                destination.add(box);
                iterator.remove();
            }
        }
    }

    public void wideBoxesLargerThan30cm(){

        List<Box> wideBoxes = new ArrayList<>();
        filterWideBoxes(30, boxesMinimumSize(),wideBoxes);

        System.out.println("Исходные коробки:");
        boxesMinimumSize().forEach(System.out::println);

        System.out.println("\nШирокие коробки (>30 см):");
        wideBoxes.forEach(System.out::println);
    }
}
