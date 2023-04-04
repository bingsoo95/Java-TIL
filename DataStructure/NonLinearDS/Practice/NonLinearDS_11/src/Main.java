// 비선형 자료구조 - 트라이 (Trie)

import java.util.HashMap;

class Node {
    HashMap<Character, Node> child;
    boolean isTerminal;

    public Node() {
        this.child = new HashMap<>();
        this.isTerminal = false;
    }

}

class Trie {
    Node root;
    public Trie() {
        this.root = new Node();
    }

    public void insert(String str) {
        Node cur = this.root;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            cur.child.putIfAbsent(c, new Node()); // putIfAbsent : c로 시작하는 키가 없으면 데이터를 추가하고 있으면 pass
            cur = cur.child.get(c);

            if (i == str.length() - 1) {
                cur.isTerminal = true;
                return;
            }
        }
    }

    public boolean search(String str) {
        Node cur = this.root;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (cur.child.containsKey(c)) {
                cur = cur.child.get(c);
            } else {
                return false;
            }

            if (i == str.length() - 1) {
                if (cur.isTerminal) {
                    return false;
                }
            }
        }
        return  true;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test code
        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.insert("april");
//        trie.insert("app");
//        trie.insert("ace");
//        trie.insert("bear");
//        trie.insert("best");
//        System.out.println(trie.search("apple"));   // true
//        System.out.println(trie.search("april"));   // true
//        System.out.println(trie.search("app"));      // true
//        System.out.println(trie.search("ace"));     // true
//        System.out.println(trie.search("bear"));    // true
//        System.out.println(trie.search("best"));    // true
//        System.out.println(trie.search("abc"));     // false
//
//        System.out.println();
//        trie.delete("apple");
//        System.out.println(trie.search("apple"));   // false
//        System.out.println(trie.search("april"));   // true
//        System.out.println(trie.search("appl"));    // false
//        trie.delete("apple");
    }
}
