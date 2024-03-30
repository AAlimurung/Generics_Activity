package MyMap;
import java.util.ArrayList;
public class MyMap<K, V> {
    public ArrayList<K> kiwi;
    public ArrayList<V> vals;

    public MyMap() {
        this.kiwi = new ArrayList<>();
        this.vals = new ArrayList<>();
    }

    public void put(K key, V val){
        //same silag element
        for(K k : kiwi){
            if(key.equals(k)){
                vals.set(kiwi.indexOf(k), val);
            }
        }

        //normal ra ang elements
        vals.add(val);
        kiwi.add(key);
    }

    public V get(K key){
        V aps = null;
//        for(K k: kiwi){
//            if(key.equals(k)){
//                aps = vals.get(kiwi.indexOf(k));
//            }
//        }

        for(int i=0; i<kiwi.size(); i++){
            if(kiwi.get(i).equals(key)){
                return vals.get(i);
            }
        }
        return null;
    }

    public V remove(K key){
        V aps = null;

//        for(K k : kiwi){
//            if(k.equals(k)){
//                aps = vals.get(kiwi.indexOf(k));
//                vals.remove(aps);
//                kiwi.remove(k);
//                return aps;
//            }
//        }

        for(int i=0; i<kiwi.size(); i++){
            if(kiwi.get(i).equals(key)){
                aps = vals.get(i);
                kiwi.remove(i);
                vals.remove(i);
                break;
            }
        }
        return aps;
    }
}
