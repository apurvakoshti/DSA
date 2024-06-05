import java.util.*;

public class implementationofhashmap {

    static class HashMap<k,v>{ //generic
        private class Node{
            k key;
            v value;
            public Node(k key, v value){
                this.key= key;
                this.value= value;
            }
        }

        private int n; // number of key-value pairs
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n=0;
            this.buckets= new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>();
            }
        }

        private int hashfunction(k key){
            int hc= Math.abs(key.hashCode());
            return hc % buckets.length;
        }

        private int searchInLL(k key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public void put(k key, v value){
            int bi = hashfunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key){
            int bi = hashfunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[oldBuck.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public v get(k key){
            int bi = hashfunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public v remove(k key){
            int bi = hashfunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public Set<k> KeySet(){
            Set<k> keys = new HashSet<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        Set<String> keys = hm.KeySet();
        for(String key: keys){
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
