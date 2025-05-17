public class SimpleBinaryTree {
    public class SimpleBinrayNode{
        int value;
        SimpleBinrayNode left;
        SimpleBinrayNode right;

        public SimpleBinrayNode(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public SimpleBinrayNode(int value, SimpleBinrayNode left, SimpleBinrayNode right){
            this.value = value;
            this.left = left;
            this.right = right;

        }

    }

    public SimpleBinrayNode insert(SimpleBinrayNode root, int currentValue){
        if (root == null) {
            return new SimpleBinrayNode(currentValue);//если нет, то просто создаём)
        }

        if (currentValue < root.value){
            root.left = insert(root.left, currentValue);
        }else if (currentValue > root.value){ //хотела вставить проверку для дубликатов, но потом убрала
            root.right = insert(root.right, currentValue);
        }

        return root;

    }
}
