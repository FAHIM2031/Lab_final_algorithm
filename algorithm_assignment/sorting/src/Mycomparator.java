package sorting.src;

import java.util.Comparator;

public class Mycomparator implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
        
    }
    
}
