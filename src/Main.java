import MagicBox.MagicBox;

public class Main {
    public static void main(String[] args) throws Exception {
        MagicBox<String> mBoxString = new MagicBox<String>(3);
        MagicBox<Integer> mBoxNum = new MagicBox<Integer>(5);

        mBoxString.add("waiting");
        mBoxString.add("purpose");
        mBoxString.pick();
        mBoxString.add("123");
        mBoxString.pick();

        mBoxNum.add(123);
        mBoxNum.add(445);
        mBoxNum.pick();
        mBoxNum.add(555);
        mBoxNum.pick();

    }
}